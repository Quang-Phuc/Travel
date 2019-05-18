package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.Travel;
import edu.fa.service.TravelService;

@Controller

public class TravelController {
	@Autowired
	private TravelService travelService;

	@RequestMapping(value = "/saveTravel", method = RequestMethod.GET)
	public String saveTravelGet(Travel travel, Model model) {
		
		return PageAction.TravelPage.SAVETRAVEL;

	}


	@RequestMapping(value = "/saveTravel", method = RequestMethod.POST)
	public String saveTravel(Travel travel, Model model) {
		travelService.save(travel);
		model.addAttribute("listTravel", travelService.findAllTravel());
		return "redirect:" + PageAction.TravelPage.VIEWTRAVEL;

	}

	@RequestMapping(value = "/viewTravel", method = RequestMethod.GET)
	public String viewTravel(Travel travel, Model model) {

		model.addAttribute("listTravel", travelService.findAllTravel());
		return "viewTravel";

	}
	
	@RequestMapping(value = "/deleteTravel", method = RequestMethod.GET)
	public String deleteHome(@RequestParam("travelId") int travelId, Model model) {

		travelService.deleteTravelBytravelId(travelId);;
		model.addAttribute("listTravel", travelService.findAllTravel());
		return "viewTravel";

	}
	
	@RequestMapping(value = "/updateTravel", method = RequestMethod.GET)
	public String updateHome(@RequestParam("travelId") int travelId, Model model) {

		travelService.findTravelBytravelId(travelId);
		model.addAttribute("listTravelBytravelId", travelService.findTravelBytravelId(travelId));
		return PageAction.TravelPage.EDITTRAVEL;

	}

}
