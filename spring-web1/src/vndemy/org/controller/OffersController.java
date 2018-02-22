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
	
	@PostMapping("/createoffer")
	public String createOffer(Model model, @Valid Offer offer, BindingResult result) {	//adding @Valid
		if (result.hasErrors()) {
			System.out.println("Error validation");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error: errors) {
				System.out.println(error.getDefaultMessage());
			}
		}
		else {
			System.out.println("Data was validated");
		}
		return "createoffer";
	}
	
	@RequestMapping("/form")	//url path likes: http://localhost:8080/project_name/form
	public String form(Model model, Offer offer) {
		System.out.println(offer);
		return "form";	//name of the jsp page
	}
	
	@RequestMapping("/test")
	public ModelAndView showTest() {
		ModelAndView mv = new ModelAndView("test");
		Map<String, Object> model = mv.getModel();
		model.put("name", "The Test value from ModelAndView");
		return mv;
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
