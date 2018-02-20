package vndemy.org.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class OffersController {

	@RequestMapping("/home")
	public String showHOme(HttpSession session) {
		session.setAttribute("name", "Cuong Bui");
		return "home";
	}
	
	@RequestMapping("/test")
	public ModelAndView showTest() {
		ModelAndView mv = new ModelAndView("test");
		Map<String, Object> model = mv.getModel();
		model.put("name", "The Test value from ModelAndView");
		return mv;
	}
	
	@RequestMapping("/test_model")
	public String showTest_model(Model model) {
		model.addAttribute("name", "Value from Model");
		return "test_model";
	}
	public OffersController() {
		// TODO Auto-generated constructor stub
	}

}
