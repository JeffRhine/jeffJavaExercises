package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	
	@RequestMapping(path="/registrationForm", method=RequestMethod.GET)
	public String showRegistrationForm(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("registrationForm")){
			modelHolder.put("registrationForm", new Registration());
		}
		return "registrationForm";
	}
	@RequestMapping(path="/registrationForm",method=RequestMethod.POST)
	public String processRegistrationForm(@Valid @ModelAttribute Registration registration, BindingResult result, RedirectAttributes flash){		
		flash.addFlashAttribute("registrationForm",registration);	
		if(result.hasErrors()){
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX+"registrationForm",result);
			return "redirect:/registrationForm";
		}
		return "redirect:/registrationConfirm";
	}
	@RequestMapping(path="/registrationConfirm",method=RequestMethod.GET)
	public String showRegistrationConfrimPage(){
		
		return "registrationConfirm";
	}
	

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	// GET: /login
	// Return the empty login view
	@RequestMapping(path="/loginForm", method=RequestMethod.GET)
	public String showLoginForm(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("loginForm")){
			modelHolder.put("loginForm", new Login());
		}
		return "loginForm";
	}
	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)

	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path="/loginForm",method=RequestMethod.POST)
	public String processLoginForm(@Valid @ModelAttribute Login login, BindingResult result, RedirectAttributes flash){
		
		flash.addFlashAttribute("loginForm",login);
		
		if(result.hasErrors()){
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX+"loginForm",result);
			return "redirect:/loginForm";
		}
		return "redirect:/loginConfirm";
	}

	@RequestMapping(path="/loginConfirm",method=RequestMethod.GET)
	public String showConfrimPage(){
		
		return "loginConfirm";
	}
}
