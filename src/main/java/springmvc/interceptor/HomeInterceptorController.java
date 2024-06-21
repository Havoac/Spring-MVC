package springmvc.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeInterceptorController {

	@RequestMapping("/homeInterceptor")
	public String HomeInterceptor() {
		return "homeInterceptor";
	}

	@RequestMapping("/welcomeInterceptor")
	public String WelcomeInterceptor(@RequestParam("user") String name, Model m) {
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcomeInterceptor";
	}
}
