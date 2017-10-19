package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NameController {

	@RequestMapping(path="/orderedName", method=RequestMethod.GET)
	public String displayName() {	
		return "orderedName";
	}
	@RequestMapping(path="/orderedResult",method=RequestMethod.GET)
	public String displayResult(@ModelAttribute NameModel nameParameters, ModelMap modelHolder) {
		modelHolder.put("nameModel", nameParameters);
		return "orderedResult";
	}
}
