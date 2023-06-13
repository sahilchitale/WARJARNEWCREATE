package com.fico.kmbl.clos.realtime.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("KMBL Corporate Loan [Consumer Loan] Decision Service Execution API")
				.description("The API generate the decisioning for Corporate Loan)").license("").termsOfServiceUrl("")
				.version("1.0.0").contact(new Contact("", "", "")).build();
	}

	@Bean
	public Docket decisionAPI() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.fico.kmbl.clos.realtime"))
				.paths(PathSelectors.ant("/clos-loan-api/*")).build().apiInfo(apiInfo());
	}
}
