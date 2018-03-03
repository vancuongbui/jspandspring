package vndemy.org.controller;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vndemy.org.dao.Offer;
import vndemy.org.service.OffersService;

@Controller
@RequestMapping("/")
public class OffersController {
	private OffersService offersService;
	
	
	public OffersService getOffersService() {
		return offersService;
	}
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}	

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		return "offers";
	}
	//Following are two method to create a record and save it to database
	//First, create new form to get input data
	@RequestMapping("/form")	//url path likes: http://localhost:8080/project_name/form
	public String form(Model model, Offer offer) {	//mapping the form:input to offer.field
		//Note: the name/path of the input has to be the same with the database's field
		System.out.println(offer);
		return "form";	//name of the jsp page
	}
	//second, mapping the form data to a record of datavase
	@PostMapping("/createoffer")
	public String createOffer(Model model, @Valid Offer offer, BindingResult result) {	//adding @Valid
		String errorMessage = "";
		if (result.hasErrors()) {
			System.out.println("Error validation");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error: errors) {
				errorMessage = error.getDefaultMessage();
				model.addAttribute("errorMessage", errorMessage);
				System.out.println(errorMessage);
			}
			return "form";	//back to the form page
		}
		else {
			System.out.println("Data was validated");
			//add new offer to database
			offersService.create(offer);
			return "createoffer";	//redirect to createoffer page
		}
		
	}
	
	//Followings are methods used to delete a record from database
	@RequestMapping("/deleteform")	//url path likes: http://localhost:8080/project_name/form
	public String deleteform(Model model, Offer offer) {
		System.out.println(offer);
		return "deleteform";	//name of the jsp page
	}
	
	@PostMapping("/deleteoffer")
	public String deleteOffer(Model model, @Valid Offer offer, BindingResult result) {	//adding @Valid
		String errorMessage = "";
		if (result.hasErrors()) {			
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error: errors) {
				errorMessage = error.getDefaultMessage();
				model.addAttribute("errorMessage", errorMessage);
				System.out.println(errorMessage);
			}
			return "deleletform";	//back to the form page
		}
		else {
			System.out.println("Offer was deleted successfully");
			//add new offer to database
			offersService.delete(offer.getId());
			return "redirect:offers";	//redirect to createoffer page
		}
		
	}
	
	//Followings are two methods used to update a record from database
	@RequestMapping("/updateform")	//url path likes: http://localhost:8080/project_name/form
	public String updateform(Model model, Offer offer) {
		System.out.println(offer);
		return "updateform";	//name of the jsp page
	}
	@PostMapping("/updateoffer")
	public String updateOffer(Model model, @Valid Offer offer, BindingResult result) {	//adding @Valid
		String errorMessage = "";
		if (result.hasErrors()) {
			System.out.println("Error validation");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error: errors) {
				errorMessage = error.getDefaultMessage();
				model.addAttribute("errorMessage", errorMessage);
				System.out.println(errorMessage);
			}
			return "updateform";	//back to the form page
		}
		else {
			System.out.println("Data was validated");
			//add new offer to database
			offersService.update(offer);
			return "createoffer";	//redirect to createoffer page
		}
		
	}	
	
	@RequestMapping(value="/test_model", method=RequestMethod.GET)
	public String showTest_model(Model model, @RequestParam("id") String id) {
		System.out.println("id is: " + id);;
		return "test_model";
	}
	
	
	public OffersController() {
		// TODO Auto-generated constructor stub
	}

}
