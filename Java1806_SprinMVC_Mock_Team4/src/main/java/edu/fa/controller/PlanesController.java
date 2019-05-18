package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.Planes;
import edu.fa.service.PlanesService;

@Controller

public class PlanesController {
	@Autowired
	private PlanesService planesService;

	@RequestMapping(value = "/savePlanes", method = RequestMethod.GET)
	public String savePlanesGet(Planes planes, Model model) {
		
		return PageAction.PlanesPage.SAVEPLANES;

	}


	@RequestMapping(value = "/savePlanes", method = RequestMethod.POST)
	public String savePlanes(Planes planes, Model model) {
		planesService.save(planes);
		model.addAttribute("listPlanes", planesService.findAllPlanes());
		return "redirect:" + PageAction.PlanesPage.VIEWPLANES;

	}

	@RequestMapping(value = "/viewPlanes", method = RequestMethod.GET)
	public String viewPlanes(Planes planes, Model model) {

		model.addAttribute("listPlanes", planesService.findAllPlanes());
		return "viewPlanes";

	}
	
	@RequestMapping(value = "/deletePlanes", method = RequestMethod.GET)
	public String deletePlanes(@RequestParam("planesId") int planesId, Model model) {

		planesService.deletePlanesByPlanesId(planesId);
		model.addAttribute("listPlanes", planesService.findAllPlanes());
		return "viewPlanes";

	}
	
	

}
