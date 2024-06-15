package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactContoller {
	@RequestMapping("/contact")
	public String ShowForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String HandleForm(@RequestParam(name = "email") String userEmail, @RequestParam("userName") String userName, @RequestParam("password") String userPassword, Model model) {
		
		System.out.println(userEmail + " " + userName + " " + userPassword);
		
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		
		return "success";
	}
}
