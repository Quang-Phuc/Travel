package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.Home;
import edu.fa.service.HomeService;
import edu.fa.service.PlanesService;
import edu.fa.service.TravelService;

@Controller

public class HomeController {
	@Autowired
	private HomeService homeService;
	@Autowired
	private TravelService travelService;
	@Autowired
	private PlanesService planesService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginOne(Model model) {
		model.addAttribute("listHome", homeService.findAllHome());
		model.addAttribute("listTravel", travelService.findAllTravel());
		model.addAttribute("listPlanes", planesService.findAllPlanes());
		return "index";
	}

	@RequestMapping(value = "/saveHome", method = RequestMethod.POST)
	public String saveHome(Home home, Model model) {
		homeService.save(home);
		return "redirect:" + PageAction.HomePage.VIEWHOME;

	}

	@RequestMapping(value = "/viewHome", method = RequestMethod.GET)
	public String viewHome(Home home, Model model) {

		model.addAttribute("listHome", homeService.findAllHome());
		return "viewHome";

	}
	
	@RequestMapping(value = "/deleteHome", method = RequestMethod.GET)
	public String deleteHome(@RequestParam("homeId") int homeId, Model model) {

		homeService.deleteHomeByHomeId(homeId);
		model.addAttribute("listHome", homeService.findAllHome());
		return "viewHome";

	}
	
	@RequestMapping(value = "/updateHome", method = RequestMethod.GET)
	public String updateHome(@RequestParam("homeId") int homeId, Model model) {

		homeService.findHomeByHomeId(homeId);
		
		model.addAttribute("listHomeByHomeId", homeService.findHomeByHomeId(homeId));
		return "EditHome";

	}

}
