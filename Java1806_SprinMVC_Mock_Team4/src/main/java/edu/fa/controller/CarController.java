package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.Car;
import edu.fa.service.CarService;

@Controller

public class CarController {
	@Autowired
	private CarService carService;

	@RequestMapping(value = "/saveCar", method = RequestMethod.GET)
	public String saveByCar(Model model) {

		return "saveCar";
	}

	@RequestMapping(value = "/saveCar", method = RequestMethod.POST)
	public String saveCar(Car car, Model model) {
		carService.save(car);
		model.addAttribute("listCar", carService.findAllCar());
		return "redirect:" + PageAction.CarPage.VIEWCAR;

	}

	@RequestMapping(value = "/viewCar", method = RequestMethod.GET)
	public String viewCar(Model model) {

		model.addAttribute("listCar", carService.findAllCar());
		return "viewCar";

	}

	@RequestMapping(value = "/deleteCar", method = RequestMethod.GET)
	public String deleteCar(@RequestParam("carId") int carId, Model model) {

		carService.deleteByCarId(carId);
		model.addAttribute("listCar", carService.findAllCar());
		return "viewCar";

	}

	@RequestMapping(value = "/updateCar", method = RequestMethod.GET)
	public String updateCar(@RequestParam("carId") int carId, Model model) {

		carService.findCarByCarId(carId);
		model.addAttribute("lisCarByCarId", carService.findCarByCarId(carId));
		return "EditCar";

	}

	@RequestMapping(value = "/viewBookCar", method = RequestMethod.GET)
	public String viewBookCar(@RequestParam("carId") int carId, Model model) {

		model.addAttribute("listCar", carService.findAllCar());
		return "viewBookCar";

	}

}
