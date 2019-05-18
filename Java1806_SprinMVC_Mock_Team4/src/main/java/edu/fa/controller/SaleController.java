package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.Sale;
import edu.fa.service.SaleService;

@Controller

public class SaleController {
	@Autowired
	private SaleService saleService;

	@RequestMapping(value = "/saveSale", method = RequestMethod.GET)
	public String saveSale(Model model) {
		
		return "saveSale";
	}

	@RequestMapping(value = "/saveSale", method = RequestMethod.POST)
	public String saveSale(Sale sale, Model model) {
		saleService.save(sale);
		model.addAttribute("listSale", saleService.findAllSale());
		return "redirect:" + PageAction.SalePage.VIEWSALE;

	}

	@RequestMapping(value = "/viewSale", method = RequestMethod.GET)
	public String viewSale( Model model) {

		model.addAttribute("listSale", saleService.findAllSale());
		return "viewSale";

	}
	
	@RequestMapping(value = "/deleteSale", method = RequestMethod.GET)
	public String deleteSale(@RequestParam("saleId") int saleId, Model model) {

		saleService.deleteSaleBySaleId(saleId);
		model.addAttribute("listSale", saleService.findAllSale());
		return "viewSale";

	}
	
	@RequestMapping(value = "/updateSale", method = RequestMethod.GET)
	public String updateSale(@RequestParam("saleId") int saleId, Model model) {

		saleService.findSaleBySaleId(saleId);
		model.addAttribute("lisSaleBySaleId", saleService.findSaleBySaleId(saleId));
		return "EditSale";

	}
	
	

}
