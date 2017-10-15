package build.test;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class IdentityAuthenticationProvider implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		SessionToken token = (SessionToken) auth;
		System.out.println("jbg"+token);
		if(token.getToken().equals("123456")){
			System.out.println("jbg"+token);
			token.setAuthenticated(true);
		} else {
			throw new AuthenticationCredentialsNotFoundException("FAILD TO VALIDATE SESSION");
		}
		return token;
		 
	}

	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

}
