package edu.fa.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.bookCar;
import edu.fa.service.BookCarService;
import edu.fa.service.CarService;

@Controller

public class BookCarController {
	@Autowired
	private BookCarService bookCarService;
	@Autowired
	private CarService carService;

	@RequestMapping(value = "/saveBookCar", method = RequestMethod.GET)
	public String saveBookCar(@RequestParam("carId") int carId, Model model) {
		model.addAttribute("carBycarId", carService.findCarByCarId(carId));
		return "saveBookCar";

	}

	@RequestMapping(value = "/savebookCar", method = RequestMethod.POST)
	public String savesavebookCar(bookCar bookCar, Model model) {
		bookCarService.save(bookCar);

		return "redirect:" + PageAction.CarPage.VIEWCAR;

	}

	@InitBinder
	private void dataBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, editor);
	}
}
