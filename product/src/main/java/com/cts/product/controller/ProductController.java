package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Login;
import com.cts.product.bean.Product;
@Controller
public class ProductController {

	@RequestMapping("addProduct.html")
	public String getaddProductPage(){
		return "addProduct";
	}	
	@RequestMapping(value = "addProduct.html", method = RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product){
		ModelAndView modelAndView = new ModelAndView();
		System.out.print(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice()+" "+product.getProductQuantity());
		return modelAndView;
	}
	
}
