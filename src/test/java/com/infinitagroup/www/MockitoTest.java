package com.infinitagroup.www;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.infinitagroup.www.model.Customer;
import com.infinitagroup.www.service.CustomerServiceImpl;


public class MockitoTest {
	
	@Mock
	private CustomerServiceImpl customerService;
	
	@Before
	public void setUp(){
		
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void calAbs(){
		
		Customer customer = new Customer.CustomerBuilder(1L, "xsj8585", "fuck you")
		.withBirthday(new Date())
		.withFirstName("shaojie")
		.withLastName("xu")
		.withGender("man")
		.withType("guest")
		.withWebsite("it")
		.build();

		
		when(customerService.getACustomer()).thenReturn(customer);
		assertEquals(this.customerService.getACustomer().getEmail(), "xsj8585");
		
	}

}
