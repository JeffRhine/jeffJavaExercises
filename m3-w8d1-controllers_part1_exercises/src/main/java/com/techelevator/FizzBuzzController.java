package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FizzBuzzController {

	
	@RequestMapping(path="/fizzBuzzRevisited", method=RequestMethod.GET)
	public String showFizBuzz(){
		return "fizzBuzzRevisited";
	}
	@RequestMapping(path="/fizzBuzzResult", method=RequestMethod.GET)
	public String printPrettyColors(@ModelAttribute FizzBuzzModel fizzBuzz, ModelMap modelHolder){
		modelHolder.put("fizzBuzzModel", fizzBuzz);
		return "fizzBuzzResult";
	}
}
