package com.lcp.springboot.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * <b><code>MemberServiceTest</code></b>
 * <p>
 * <p/>
 * <p>
 * Description
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 15:27.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Test
    public void testDeleteModel(){
        int value=memberService.deleteModel(1);
        Assert.assertTrue(value>1);
    }
}
