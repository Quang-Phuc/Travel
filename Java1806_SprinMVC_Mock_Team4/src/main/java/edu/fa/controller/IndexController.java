package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fa.service.CarService;
import edu.fa.service.HomeService;
import edu.fa.service.SaleService;
import edu.fa.service.TravelService;

@Controller
public class IndexController {

	@Autowired
	private SaleService saleService;

	@Autowired
	private HomeService homeService;
	@Autowired
	private TravelService travelService;

	@Autowired
	private CarService carService;

	@RequestMapping(value = "/sale", method = RequestMethod.GET)
	public String showSale(Model model) {

		model.addAttribute("listSale", saleService.findAllSale());
		return "Sale";
	}

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String showLoginOne(Model model) {
		model.addAttribute("listHome", homeService.findAllHome());
		model.addAttribute("listTravel", travelService.findAllTravel());

		return "index";
	}

	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public String showCar(Model model) {

		model.addAttribute("listCar", carService.findAllCar());
		return "Car";
	}

}
