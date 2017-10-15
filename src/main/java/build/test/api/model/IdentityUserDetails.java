package build.test.api.model;

import org.springframework.stereotype.Component;

@Component
public class IdentityUserDetails {
	
	String name;
	String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

}
