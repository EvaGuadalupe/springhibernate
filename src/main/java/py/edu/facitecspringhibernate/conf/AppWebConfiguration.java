package py.edu.facitecspringhibernate.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.springhibernate.dao.ClienteDao;
import py.edu.facitecspringhibernate.controller.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,ClienteDao.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}

}

