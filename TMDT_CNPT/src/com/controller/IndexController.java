package com.controller;

import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.factory.*;

@Controller
public class IndexController {

	@RequestMapping(value="/Home", method = RequestMethod.GET)
	public String Index(ModelMap map){
		map.addAttribute("AllCategory", CategoryFactory.getAll());
		map.addAttribute("AllSub", SubFactory.GetAll());
		map.addAttribute("AllSlider", SliderFactory.GetAll());
		map.addAttribute("ProductFeatured", SanphamFactory.getProductFeatured(new String[]{"10"}));
		map.addAttribute("ProductNew", SanphamFactory.getProductNew(new String[]{"10"}));
		map.addAttribute("ProductSelling", SanphamFactory.getProductSelling(new String[]{"10"}));
		return "home-view";
	}
}
