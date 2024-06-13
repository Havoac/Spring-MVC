package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String homePage() 
	{
		System.out.println("hello, this is my project");
		return "index";
	}
	
	@RequestMapping(value = "/home")
	public String home(Model model) 
	{
		System.out.println("this is home url");
		
		/* Sending data from controller to view */
		
		model.addAttribute("name", "Shivansh Singh");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Aman");
		friends.add("Devesh");
		
		model.addAttribute("f", friends);
		
		return "home";
	}
	
	@RequestMapping(value = "/about")
	public String about() 
	{
		System.out.println("this is about url");
		return "about";
	}
	
	@RequestMapping(value = "/help")
	public ModelAndView help() 
	{
		System.out.println("this is help controller");
		
		/* sending data from controller to view */
		
		/* creating model and view object */
		ModelAndView modelAndView = new ModelAndView();
		
		/* setting the data */
		modelAndView.addObject("name", "havoc");
		modelAndView.addObject("roll no", 715);
		
		/* setting the view name */
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
