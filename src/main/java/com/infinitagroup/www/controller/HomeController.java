package com.infinitagroup.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
		
	
    @RequestMapping(method=RequestMethod.GET, value="/")
    public String displaySortedMembers(Model model) {
    	    	    	
        return "index";
    }

	
}
