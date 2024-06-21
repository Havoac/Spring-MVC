package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ NullPointerException.class })
	public String ExceptionHandlerNull(Model m) {
		m.addAttribute("msg", "Null pointer exception has occured");
		return "null_page";
	}
//
//	/* Generalized */
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ Exception.class })
	public String GeneralizedExceptionHandler(Model m) {
		m.addAttribute("msg", "Exception has occured");
		return "null_page";
	}
}
