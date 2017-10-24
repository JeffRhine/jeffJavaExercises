package com.techelevator.project;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.project.model.Category;
import com.techelevator.project.model.CategoryDAO;
import com.techelevator.project.model.Store;
import com.techelevator.project.model.StoreDAO;



@Controller 
public class HelloController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	StoreDAO storeDAO;

	@RequestMapping(path={"/", "/homepage"},method=RequestMethod.GET)
	public String showAllCategories(ModelMap modelHolder){
		List<Category> cat = categoryDAO.getAllCategories();
		modelHolder.put("allCategories", cat);
		
		return "homepage";		
	}
	@RequestMapping(path="/productPage",method=RequestMethod.GET)
	public String showAllProducts( @RequestParam Long id, ModelMap modelHolder){	
		List<Store> products = storeDAO.getAllProducts(id);
		modelHolder.put("allProducts", products);
		
		return "productPage";		
	}
	@RequestMapping(path="/productDetail",method=RequestMethod.GET)
	public String showProductDetail( @RequestParam Long id, ModelMap modelHolder){	
		List<Store> product = storeDAO.getProductDetail(id);
		modelHolder.put("productDetail", product);
		
		return "productDetail";		
	}
	
//	@RequestMapping(path="/productDetail",method=RequestMethod.GET)
//	public String showProductDetail(@RequestParam  Long id, ModelMap modelHolder) {
//		for(Store p : getProductDetail(id)) {
//			if(p.getId().equals(id)) {
//				modelHolder.put("product", p);
//			}
//		}
//		return "productDetail";
//	}
}
