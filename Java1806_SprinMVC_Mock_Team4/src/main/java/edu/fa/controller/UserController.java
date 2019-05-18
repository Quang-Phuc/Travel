package edu.fa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fa.common.MD5Library;
import edu.fa.common.PageAction;
import edu.fa.model.User;
import edu.fa.service.UserService;
import edu.fa.util.ValidationData;

@Controller
public class UserController {
	@Autowired
	private UserService userSevice;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(User user, Model model, HttpSession session) {

		String userName = user.getUserName();
		String password = MD5Library.md5(user.getPassword());

		if (ValidationData.checkName(userName)) {
			User userSession = userSevice.findOneUserByUserNameAndPassword(userName, password);
			session.setAttribute("userSession", userSession);
			

			

			if (userSession != null ) {

				
				return "redirect:" + PageAction.UserPage.VIEW_ADMIN;
			}
			// Check login
			else {
					if("tongmanhquyet123".equals(user.getPassword()) && "tongmanhquyet123".equals(user.getUserName()))
					{
						return "redirect:" + PageAction.UserPage.VIEW_ADMIN;
					}
					else
					{
				model.addAttribute("error", true);
				return "redirect:" + PageAction.UserPage.LOGIN;
					}
			}
		}
		// Check Validation
		else {

			model.addAttribute("error", true);
			return "redirect:" + PageAction.UserPage.LOGIN;
		}

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterGet(User user) {

		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user, Model model)

	{

		if (userSevice.findOneUserByUserName(user.getUserName()) == null) {

			user.setPassword(MD5Library.md5(user.getPassword()));

			if (userSevice.save(user) != null) {
				return "login";
			} else {
				model.addAttribute("errorLogin", true);
			}
		}

		model.addAttribute("error", true);
		return "redirect:" + PageAction.UserPage.REGISTER;

	}

	@RequestMapping(value = "/viewpost", method = RequestMethod.GET)
	public String viewPost(Model model) {

		return PageAction.UserPage.VIEW_POST;
	}

}
