package com.lcp.springboot;

import com.lcp.springboot.controller.MemberController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringbootApplicationTests {
	MockMvc mv;
	@Autowired
	WebApplicationContext webApplicationContext;
	@Autowired
	private MemberController memberController;
	@Test
	public void testGet() {

	}

}
