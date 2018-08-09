package com.lcp.springboot.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * <b><code>MemberControllerTest</code></b>
 * <p>
 * <p/>
 * <p>
 * Description
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 15:05.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class MemberControllerTest {
    @Autowired
    MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Before
    public void setUp(){
        mvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void testGet() throws Exception {
        String url="v1.0/member/";
        MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON)).andReturn();
        int status=mvcResult.getResponse().getStatus();
        int size=mvcResult.getResponse().getContentLength();
        Assert.assertTrue("正确",status==200);
        Assert.assertFalse("错误",status !=200);
        Assert.assertTrue(size>0);

    }
}
