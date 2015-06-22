package com.infinitagroup.www.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
    
    
    @RequestMapping(value="/main", method = RequestMethod.GET)
    public String printWelcome(ModelMap model, Principal principal ) {
    String name = principal.getName();
    model.addAttribute("username", name);
    return "main_page";
    }
   
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
   
    return "login_page";
   
    }
   
    @RequestMapping(value="/loginError", method = RequestMethod.GET)
    public String loginError(ModelMap model) {
    model.addAttribute("error", "true");
    return "login_page";
  
    }


	
}
