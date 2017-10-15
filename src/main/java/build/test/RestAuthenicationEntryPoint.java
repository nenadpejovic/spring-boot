package build.test;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component("entryPoint")
public class RestAuthenicationEntryPoint implements AuthenticationEntryPoint{

	public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException ex)
			throws IOException, ServletException {
		res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Failed fo validate SESSION_ID");
		
	}

}