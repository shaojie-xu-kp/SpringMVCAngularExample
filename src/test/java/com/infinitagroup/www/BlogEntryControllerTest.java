package com.infinitagroup.www;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.infinitagroup.www.controller.BlogEntryController;
import com.infinitagroup.www.model.Customer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@WebAppConfiguration
public class BlogEntryControllerTest {
	
    @Autowired
    private WebApplicationContext webApplicationContext;

	
	@InjectMocks
	private BlogEntryController blogEntryController;
	
	private MockMvc mocMvc;
	
	
	@Before
	public void setUp(){
		
		MockitoAnnotations.initMocks(this);
		
//		mocMvc = MockMvcBuilders.standaloneSetup(blogEntryController).build();
		mocMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
	}
	
	@Test
	public void test() throws Exception{
		
		Customer customer = new Customer.CustomerBuilder(1L, "xsj8585@hotmail.com", "fuck you")
		.withBirthday(new Date())
		.withFirstName("shaojie")
		.withLastName("xu")
		.withGender("man")
		.withType("guest")
		.withWebsite("it")
		.build();

		
		mocMvc.perform(get("/rest/customers")).andDo(print());
		mocMvc.perform(post("/test")
					  .content("{\"name\":\"shaojie\",\"surname\":\"xu\",\"email\":\"xsj8585@hotmail.com\"}")
					  .contentType(MediaType.APPLICATION_JSON)
				).andExpect(jsonPath("$.name",is("junyi")))
				 .andDo(print());
		
		
	}

}
