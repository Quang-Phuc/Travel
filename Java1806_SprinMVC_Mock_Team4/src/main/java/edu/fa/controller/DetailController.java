package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.service.CarService;
import edu.fa.service.HomeService;
import edu.fa.service.SaleService;
import edu.fa.service.TravelContentService;
import edu.fa.service.TravelService;

@Controller

public class DetailController {
	@Autowired
	private HomeService homeService;
	@Autowired
	private TravelService travelService;
	@Autowired
	private SaleService saleService;
	@Autowired
	private TravelContentService travelContentService;
	@Autowired
	private CarService carService;


	
	@RequestMapping(value = "/Detail", method = RequestMethod.GET)
	public String DetailHome(@RequestParam("homeId") int homeId, Model model) {
		model.addAttribute("listHome", homeService.findAllHome());
		model.addAttribute("listTravel", travelService.findAllTravel());
		
		homeService.findHomeByHomeId(homeId);
		model.addAttribute("listHomeByHomeId", homeService.findHomeByHomeId(homeId));
		return "DetailHome";

	}
	
	@RequestMapping(value = "/DetailSale", method = RequestMethod.GET)
	public String updateHome(@RequestParam("saleId") int saleId, Model model) {
		model.addAttribute("listHome", homeService.findAllHome());
		model.addAttribute("listTravel", travelService.findAllTravel());
		
		saleService.findSaleBySaleId(saleId);
		model.addAttribute("lisSaleBySaleId", saleService.findSaleBySaleId(saleId));
		return "DetailSale";

	}
	@RequestMapping(value = "/DetailTravelContent", method = RequestMethod.GET)
	public String DetailIndex(@RequestParam("travelId") int travelId, Model model) {
		
		travelContentService.findTravelContentByTravelTravelId(travelId);
		model.addAttribute("listHome", homeService.findAllHome());
		model.addAttribute("listTravel", travelService.findAllTravel());
		model.addAttribute("listTravelContentByTravelTravelId", travelContentService.findTravelContentByTravelTravelId(travelId));
		
		return "DetailTravelContent";

	}
	
	@RequestMapping(value = "/DetailCar", method = RequestMethod.GET)
	public String DetailCar(@RequestParam("carId") int carId, Model model) {
		model.addAttribute("listCar", homeService.findAllHome());
		model.addAttribute("listTravel", travelService.findAllTravel());
		
		carService.findCarByCarId(carId);
		model.addAttribute("lisCarByCarId", carService.findCarByCarId(carId));
		return "DetailCar";

	}

}
