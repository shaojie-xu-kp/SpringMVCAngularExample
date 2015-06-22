package com.infinitagroup.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.infinitagroup.www.model.Customer;


@Controller
public class BlogEntryController {
	
	
	@RequestMapping(value = "/test", method = RequestMethod.POST )
	public @ResponseBody Customer test(@RequestBody Customer customer_request){
			
		customer_request.setName("junyi");
		
		return customer_request;
	}

}
