package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fa.service.TreeService;
import edu.fa.service.impl.Node;

@Controller

public class TreeController {
	@Autowired
	private TreeService treeService;

	@RequestMapping(value = "/tree", method = RequestMethod.GET)
	public String saveBookCar(Model model, Node node) {
		model.addAttribute("printTree", treeService.printTree(node));
		return "tree";

	}

}
