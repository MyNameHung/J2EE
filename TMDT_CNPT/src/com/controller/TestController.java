package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.dto.*;
import com.model.factory.*;

@Controller

public class TestController {

	
	@RequestMapping(value = "/addCategory", method = RequestMethod.GET)
	public String addCategory(Category c) {
		if(c != null)
			CategoryFactory.Save(c);
		return "addCategory";
	}
    
    @RequestMapping(value="/addSub", method=RequestMethod.GET)
    public String addSub(Sub sub,ModelMap model) {
    	
    	//System.out.println(sub.getTen() + sub.getMota() + sub.getCategory().getMa_category() );
    	if(sub != null)
    		SubFactory.Save(sub);
    	model.addAttribute("listCategory",CategoryFactory.GetAll());
    	model.addAttribute("sub", new Sub());
    	return "addSub";
    }
    
	@RequestMapping(value = "/addHangsx", method = RequestMethod.GET)
	public String addHangsx(Hangsx h) {
		if(h != null)
			HangsxFactory.Save(h);
		return "addHangsx";
	}
	
	@RequestMapping(value = "/addNganhcn", method = RequestMethod.GET)
	public String addNganhcn(Nganhcn n) {
		if(n != null)
			NganhcnFactory.Save(n);
		return "addNganhcn";
	}
}
