package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");		// any url can be used. don't use '/two' because it will remove the prefix url
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("two handler");
		return "contact";
	}
}
