package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.factory.CategoryFactory;
import com.model.factory.SubFactory;

@Controller(value="Category")
public class CategoryController {

	@RequestMapping(value="/Category", method = RequestMethod.GET)
	public String Category(ModelMap map, String id){
		map.addAttribute("AllCategory", CategoryFactory.getAll());
		map.addAttribute("AllSub", SubFactory.getAll());
		map.addAttribute("ProductNew", CategoryFactory.getProductNew(new String[]{id, "0", "20"}));
		return "Category-View";
	}
}
