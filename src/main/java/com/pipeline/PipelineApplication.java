package com.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication

public class PipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelineApplication.class, args);
	}

	// @Override
	// public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// registry.addResourceHandler("/test/**")
	// .addResourceLocations("file:///C:/Sambhav/Installations/workspace/demo-staticresource/ext-resources/")
	// .setCachePeriod(0);
	// }
}
