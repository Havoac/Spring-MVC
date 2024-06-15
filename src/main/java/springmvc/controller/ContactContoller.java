package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class ContactContoller {
	@ModelAttribute
	public void ShowHeader(Model model, String heading) {		// if we use the function name as "commonDataForModel" then it will automatically be called. No need to call this function
		model.addAttribute("Header", heading);
	}
	
	@RequestMapping("/contact")
	public String ShowForm(Model model) {
		ShowHeader(model, "Registration form");
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String HandleForm(@ModelAttribute User user, Model model) {
		
//		User user = new User();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(userPassword);
		
		System.out.println(user);
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
//		
//		model.addAttribute("user", user);
		ShowHeader(model, "Form created");
		return "success";
	}
}
