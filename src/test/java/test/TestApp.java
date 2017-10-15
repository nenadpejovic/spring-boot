package test;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import build.test.App;
import build.test.config.ConfigService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
public class TestApp {
	
	@Autowired
	ConfigService config;
	
	@Test
	public void simpleTest(){
		assertEquals(config.getName(),"\"Nenad\"");
	}

}
