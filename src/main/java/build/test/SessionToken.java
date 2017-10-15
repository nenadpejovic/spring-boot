package build.test;
import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;


public class SessionToken implements Authentication{
	
	private String token;
	
	private boolean valid;
	
	
	public SessionToken(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String getName() {
		return "OPEN SOCIAL VIEW ID";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public Object getCredentials() {
		return null;
	}

	@Override
	public Object getDetails() {
		return null;
	}

	@Override
	public Object getPrincipal() {
		return null;
	}

	@Override
	public boolean isAuthenticated() {
		return valid;
	}

	@Override
	public void setAuthenticated(boolean valid) throws IllegalArgumentException {
		this.valid = valid;
	}

}
