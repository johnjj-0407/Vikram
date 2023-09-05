package com.test.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="My Swagger Application",version = "1.0",description = "documented by (John)"))
public class Preparation2SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Preparation2SwaggerApplication.class, args);
	}

}
