package com.techelevator;


import java.time.LocalDateTime;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;



@Controller 
public class HelloController {
	
	@Autowired
	ReviewDao reviewDao;

	@RequestMapping("/homepage")
	public String displayGreeting() {
		
		return "homepage";
	}
	
	@RequestMapping(path="/homepage",method=RequestMethod.GET)
	public String showAllPosts(ModelMap modelHolder){
		List<Review> reviews = reviewDao.getAllReviews();
		modelHolder.put("allReviews", reviews);
		
		return "homepage";		
	}
	@RequestMapping(path={"/reviewPage"}, method=RequestMethod.GET)
	public String goToReviewPage(){
		return "reviewPage";
	}
	




@RequestMapping(path="/reviewPage",method=RequestMethod.POST)
public String processReview(@Valid @ModelAttribute Review newReview, BindingResult result, RedirectAttributes flash){
	flash.addFlashAttribute("reviewPage",newReview);	
	if(result.hasErrors()){
		flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX+"reviewPage",result);
		return "redirect:/reviewPage";
	}
	newReview.setDateSubmitted(LocalDateTime.now());
	reviewDao.save(newReview);
	return "redirect:/homepage";
}

}



