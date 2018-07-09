package com.example.mydemo;

import com.example.demo.DemoApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SpringBootTest(classes = DemoApplication.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MySpringBootTestAnnotation {
}
