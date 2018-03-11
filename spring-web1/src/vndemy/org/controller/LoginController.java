package vndemy.org.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.mysql.cj.core.Constants;

import vndemy.org.dao.User;
import vndemy.org.dao.UsersDAO;

@Controller
public class LoginController {
	private UsersDAO usersDao;
		
	public UsersDAO getUsersDao() {
		return usersDao;
	}
	@Autowired
	public void setUsersDao(UsersDAO usersDao) {
		this.usersDao = usersDao;
	}
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	//mapping createaccount.jsp
	@RequestMapping("/createaccount")
	public String showNewAccount(Model model, @Validated @ModelAttribute("userForm") 
								User user, 
								BindingResult result,
								HttpSession session) {
		//session
		session.setAttribute("user", user);
		
		if (result.hasErrors()) {
			model.addAttribute("userErrorMessage", result.getFieldError("username").getDefaultMessage());
			model.addAttribute("passErrorMessage", result.getFieldError("password").getDefaultMessage());
			System.out.println(user);	
			System.out.println(result.getAllErrors());
			return "signupform";
		}
		else {
			if ((user.getPassword()).equals(user.getconfirmPassword())) {
				if (usersDao.exist(user.getUsername())) {
					System.out.println("Cought duplicate username");
					model.addAttribute("userErrorMessage", "the username was already exist");
					result.rejectValue("username", "DuplicateKey.user.username", "This username is already exist");
					return "signupform";
				}
				try {
					usersDao.create(user);
				} 
				catch (DataAccessException e) {
					
					System.out.println(e.getClass());
					result.rejectValue("username", "DuplicateKey.user.username", "This username is already exist");
					return "signupform";
				}
				
				System.out.println("new user was created");				
			    //...
			    
				return "createaccount";
			}
			else {
				model.addAttribute("passErrorMessage", "password mismatched");
				return "signupform";				
			}			
		}		
	}
	
	
	//mapping signupform.jsp
	@RequestMapping("/signupform")
	public String showSignupForm(Model model, User user, HttpSession session) {
		//System.out.println(user);
		user = (User)session.getAttribute("user");
		
		return "signupform";
	}
	//mapping logout
	@RequestMapping("/logout")
	public String showLogout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth !=null) {	//if there is no authentication here
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}
	
	//mapping admin page
	@RequestMapping("/admin")
	public String adminController(Model model) {
		List<User> users = usersDao.getUsers();
		model.addAttribute("adminUsers", users);
		return "admin";
	}	
}
