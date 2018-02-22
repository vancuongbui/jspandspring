package vndemy.org.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vndemy.org.dao.Offer;

@Controller
public class homeController {
	
	@RequestMapping("/")
	public String homeController() {
		
		return "home";
	}

	public homeController() {
		// TODO Auto-generated constructor stub
	}

}
