package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

	@Bean //anota um método com Bean para que ele seja geranciado pelo Spring IoC Containner
	OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
					.title("RESTful API with Java 17 and Spring Boot 3")
					.version("v1")
					.description("Some description about your API")
					.termsOfService("https://springdoc.org/#faq")
					.license(new License()
						.name("Apache 2.0")
						.url("https://www.apache.org/licenses/LICENSE-2.0")));
	}
}
