package com.tiendaOnline.springboot.app;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/").setViewName("bienvenido");
		registry.addViewController("/bienvenido").setViewName("bienvenido");
		registry.addViewController("/home").setViewName("bienvenido");
		registry.addViewController("/inicio").setViewName("bienvenido");
		registry.addViewController("/logeo").setViewName("login");
		registry.addViewController("/login").setViewName("login");
		/*registry.addViewController("/bienvenida").setViewName("bienvenida");*/
		registry.addViewController("/error").setViewName("error");
	}
	
	
	
	
	
}