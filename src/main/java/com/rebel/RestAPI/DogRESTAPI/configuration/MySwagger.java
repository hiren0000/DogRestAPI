package com.rebel.RestAPI.DogRESTAPI.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiDescription;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.Collections;

@Configuration
@EnableSwagger2
public class MySwagger
{
    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfo("DogAPi",
                "This api returns dog info",
                "1.0","www.rebel.com",
                new Contact("Hiren Devmurarai", "www.rebel.com","r1@gmail.com"),
                "Licence of API",
                "http://www.udacity.com/license",
                Collections.emptyList());
    }

}
