package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactContoller {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void ShowHeader(Model model, String heading) { // if we use the function name as "commonDataForModel" then it
															// will automatically be called. No need to call this
															// function
		model.addAttribute("Header", heading);
	}

	@RequestMapping("/contact")
	public String ShowForm(Model model) {
		ShowHeader(model, "Registration form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String HandleForm(@ModelAttribute User user, BindingResult result, Model model) {
		System.out.println(user);

		if (user.getUserName().isBlank()) {
			return "redirect:/contact";
		}

		this.userService.createUser(user);

		ShowHeader(model, "Form created");

		if (result.hasErrors()) {
			System.out.println("Error found");
			return "contact";
		}

		return "success";
	}
}
