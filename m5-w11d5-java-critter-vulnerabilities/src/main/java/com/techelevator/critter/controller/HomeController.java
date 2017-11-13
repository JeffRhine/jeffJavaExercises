package com.techelevator.critter.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.critter.model.MessageDAO;
import com.techelevator.critter.model.UserDAO;

@Controller
public class HomeController {
	
	private MessageDAO messageDAO;
	private UserDAO userDAO;

	@Autowired
	public HomeController(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showHomePage(Map<String, Object> model) {
		model.put("messages", messageDAO.getPublicMessages(10));
		return "home";
	}
	@RequestMapping(path="/deleteMessage", method=RequestMethod.POST)
	public void deleteMessage(@RequestParam long id){
		
		messageDAO.deleteMessage(id);
	}
}
//@RequestMapping(path="/login", method=RequestMethod.POST)
//public String login(@RequestParam String userName, 
//					@RequestParam String password, 
//					HttpServletRequest request,
//					@RequestParam(required=false) String destination) {
//	if(userDAO.searchForUsernameAndPassword(userName, password)) {
//		request.changeSessionId();
//		request.getSession().setAttribute("currentUser", userName);
//		if(destination!=null&& !destination.isEmpty()){
//			return "redirect:" + destination;
//		}else{
//		return "redirect:/users/"+userName;
//		}
//	} else {
//		return "redirect:/login";
//	}
//}