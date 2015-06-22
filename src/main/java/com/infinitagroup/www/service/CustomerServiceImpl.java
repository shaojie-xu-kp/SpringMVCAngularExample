package com.infinitagroup.www.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.infinitagroup.www.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public Customer getACustomer() {
		
		Customer customer = new Customer.CustomerBuilder(1L, "xsj8585@hotmail.com", "fuck you")
		.withBirthday(new Date())
		.withFirstName("shaojie")
		.withLastName("xu")
		.withGender("man")
		.withType("guest")
		.withWebsite("it")
		.build();
		
		return customer;
	}

}
