package com.my.settinged;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.settinged.util.LogInterceptor;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(LogInterceptor.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
}
