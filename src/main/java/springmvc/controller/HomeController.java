package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String homePage() 
	{
		System.out.println("hello, this is my project");
		return "index";
	}
	
	@RequestMapping(value = "/home")
	public String home() 
	{
		System.out.println("this is home url");
		return "home";
	}
	
	@RequestMapping(value = "/about")
	public String about() 
	{
		System.out.println("this is about url");
		return "about";
	}
}
