package com.example.mydemo;

import com.example.demo.MyBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@MySpringBootTestAnnotation
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    private MyBean myBean;

    @Test
    public void contextLoads() {
    }

}
