import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
	
		XmlWebApplicationContext WebApplicationContext = new XmlWebApplicationContext();
		
		WebApplicationContext.setConfigLocation("classpath:application-config.xml");
		
		
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		
		
	ServletRegistration.Dynamic myCustomDispatcherServlet =	servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
	
	myCustomDispatcherServlet.setLoadOnStartup(1);
	myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
	
	}

}
