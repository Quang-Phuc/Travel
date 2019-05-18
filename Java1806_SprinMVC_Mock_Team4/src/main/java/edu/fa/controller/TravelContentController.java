package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.Home;
import edu.fa.model.TravelContent;
import edu.fa.service.TravelContentService;
import edu.fa.service.TravelService;

@Controller

public class TravelContentController {
	@Autowired
	private TravelService travelService;
	@Autowired
	private TravelContentService travelContentService;

	

	@RequestMapping(value = "/saveTravelContent", method = RequestMethod.GET)
	public String saveTravelContent(TravelContent travelContent, Model model) {
		model.addAttribute("listtravel", travelService.findAllTravel());
		return PageAction.TravelContentPage.SAVETRAVELCONTENT;

	}
	
	@RequestMapping(value = "/saveTravelContent", method = RequestMethod.POST)
	public String saveTravelContentPOST(TravelContent travelContent, Model model) {
		travelContentService.save(travelContent);
		return "redirect:" + PageAction.TravelContentPage.VIEWTRAVELCONTENT;

	}

	@RequestMapping(value = "/viewContentTravel", method = RequestMethod.GET)
	public String viewHome(Home home, Model model) {

		model.addAttribute("listContentTravel", travelContentService.findAllTravelContent());
		return "viewContentTravel";

	}
	
	@RequestMapping(value = "/deleteContentTravel", method = RequestMethod.GET)
	public String deleteContentTravel(@RequestParam("travelContentId") int travelContentId, Model model) {

		travelContentService.deleteTravelContentByTravelContentId(travelContentId);;
		model.addAttribute("listContentTravel", travelContentService.findAllTravelContent());
		return "viewContentTravel";

	}
	
	@RequestMapping(value = "/updateContentTravel", method = RequestMethod.GET)
	public String updateHome(@RequestParam("travelContentId") int travelContentId, Model model) {
		model.addAttribute("listtravel", travelService.findAllTravel());
		travelContentService.findTravelContentByTravelContentId(travelContentId);
		model.addAttribute("listContentTravelByTravelContentId", travelContentService.findTravelContentByTravelContentId(travelContentId));
		return "EditContentTravel";

	}
	
	

}
