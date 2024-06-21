package springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("PreHandle method is called. URL: " + request.getRequestURL());

		String name = request.getParameter("user");
		
		if(name == null)
		{
			response.setContentType("text/html");
			response.getWriter().println("Null value of the user");
			return true;
		}
		
		if (name.startsWith("S")) {
			response.setContentType("text/html");
			response.getWriter().println("Invalid name... Name starts with S");
			return false;
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("This is Post Handler");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("This is after Completion");
		super.afterCompletion(request, response, handler, ex);
	}

}
