package com.sportyshoes.api;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication()
@EnableSwagger2
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		System.out.println("Spring Boot - Sporty Shoes Api Application works!!!!!!!!");
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.sportyshoes.api"))
				.build()
				.apiInfo(apiDetails());
	}
	 
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Spring Boot Swagger SportyShoes API",
				"Spring Boot SportyShoes application with Swagger",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("AswiniPalani", "https://github.com/Aswini88Palani/", "aswini88.palani@gmail.com"),
				"API License",
				"https://github.com/Aswini88Palani/",
				Collections.emptyList()
				);
	}
}
