package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/controller")
public class HomeController {
	@RequestMapping(value = "/")
	public String homePage() {
		System.out.println("hello, this is my project");
		return "index";
	}

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
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
	public String about() {
		System.out.println("this is about url");

//		String str = null;
//		System.out.println(str.length());

		return "about";
	}

	@RequestMapping(value = "/help")
	public ModelAndView help() {
		System.out.println("this is help controller");

		/* sending data from controller to view */

		/* creating model and view object */
		ModelAndView modelAndView = new ModelAndView();

		/* setting the data */
		modelAndView.addObject("name", "havoc");
		modelAndView.addObject("roll_no", 715);

		// marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		modelAndView.addObject("marks", list);

		/* setting the view name */
		modelAndView.setViewName("help");

		return modelAndView;
	}
}
