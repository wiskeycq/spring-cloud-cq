package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class DemoApplicationTests {

	@Autowired
	private  TestCon testCon;
	@Test
	public void contextLoads() {
		testCon.teacher();
		System.out.println("1111111");
	}

}
