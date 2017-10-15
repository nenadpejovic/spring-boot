package build.test.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import build.test.config.ConfigService;

@RestController
public class TestController {

	@Autowired
	ConfigService config;
	
	@RequestMapping(method=RequestMethod.GET,value="/fuck/this")
	public String getInfo(){
		return "jbg";
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/fuck/thisup")
	public String getInfoas(){
		return "jbgica";
	}
	

	
	
	@RequestMapping(method=RequestMethod.GET,value="/success/test")
	public String getInfoSuccesTest(){
		return "test";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/test/test")
	public String getInfoTestTest(){
		return "test test";
	}
}
