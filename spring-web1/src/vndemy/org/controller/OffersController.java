package vndemy.org.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vndemy.org.dao.Offer;
import vndemy.org.service.OffersService;

@Controller
@RequestMapping("/app")
public class OffersController {
	private OffersService offersService;
	
	
	public OffersService getOffersService() {
		return offersService;
	}
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/home")
	public String showHOme(Model model) {
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
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
