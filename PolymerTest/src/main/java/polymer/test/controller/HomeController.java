package polymer.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller class, which handles all the requests of web portal application
 *
 */
@Controller
public class HomeController {

	/**
	 * Handles home page request
	 * 
	 * @return modelView
	 */
	@RequestMapping(value = "/home")
	public ModelAndView handleWelcomeRequest() {
		ModelAndView modelView = new ModelAndView("home");
		return modelView;
	}

}
