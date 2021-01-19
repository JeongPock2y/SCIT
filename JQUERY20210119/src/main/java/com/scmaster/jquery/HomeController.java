package com.scmaster.jquery;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);


		return "home";
	}
	@RequestMapping(value ="closet", method = RequestMethod.GET)
	public String closet(){
		return "closet";
	}
	@RequestMapping(value ="test1", method = RequestMethod.GET)
	public String test1(){
		return "test1";
	}
	@RequestMapping(value ="test2", method = RequestMethod.GET)
	public String test2(){
		return "test2";
	}
	@RequestMapping(value ="test3", method = RequestMethod.GET)
	public String test3(){
		return "child";
	}
	@RequestMapping(value ="each", method = RequestMethod.GET)
	public String each(){
		return "each";
	}

}
