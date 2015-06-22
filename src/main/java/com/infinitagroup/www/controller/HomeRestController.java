package com.infinitagroup.www.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.infinitagroup.www.model.Customer;
import com.infinitagroup.www.service.CustomerService;

@Controller
public class HomeRestController {
	
	@Autowired
	CustomerService customerService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeRestController.class);

	@RequestMapping(method=RequestMethod.GET, value="/rest/customers", produces = "application/json")
	public @ResponseBody Customer getCustomers(Model model, HttpServletRequest request) {
		
		Customer customer = customerService.getACustomer();
		
		logger.info(customer.getEmail() + " has been retrieved.");
				
		return customer;
	}


}
