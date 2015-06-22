package basics.in.java.blogspot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
public class WebAppInitializer extends SpringBootServletInitializer {
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		     return application.sources(Application.class).profiles("openshift");
	         
	    }
	 

}
