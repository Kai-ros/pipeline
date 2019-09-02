package com.pipeline.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class RootApplication {
	public static void main(String[] args) {
		SpringApplication.run(RootApplication.class, args);
	}

	// @Override
	// public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// registry.addResourceHandler("/test/**")
	// .addResourceLocations("file:///C:/Sambhav/Installations/workspace/demo-staticresource/ext-resources/")
	// .setCachePeriod(0);
	// }
}
