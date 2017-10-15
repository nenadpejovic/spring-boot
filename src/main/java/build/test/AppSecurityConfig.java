package build.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Autowired
	RestAuthenicationEntryPoint entryPoint;
	
	@Autowired
	IdentityAuthenticationProvider provider;
	
	@Autowired
	AuthFilter filter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	      http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER).and().authorizeRequests()
          .antMatchers("/success/*","/test/*").permitAll().anyRequest().authenticated().and().
          addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class).exceptionHandling().authenticationEntryPoint(entryPoint);
          
	}
	
    @Bean
    public FilterRegistrationBean filterRegistrationBean () {  
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();     
        registrationBean.setFilter(filter);    
        registrationBean.setEnabled(false);
        return registrationBean;
    }
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(provider);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**","/static/**");
	}
}
