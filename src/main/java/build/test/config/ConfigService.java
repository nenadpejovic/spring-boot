package build.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;



@Service
public class ConfigService {

	@Autowired
	Environment env;
	
	public String getName(){
		return env.getProperty("my.name");
	}
	
	public String getSurname(){
		return env.getProperty("my.surname");
	}
	
	public String getNickname(){
		return env.getProperty("my.nickname");
	}

	public String getBrotherName(){
		return env.getProperty("my.brother.name");
	}
}
