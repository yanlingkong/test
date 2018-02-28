package com.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置
 * Created by liuc on 2018/1/8.
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("百度 API")
                .apiInfo(apiInfo())
                .select()//访问demo下controller下的方法
                .apis(RequestHandlerSelectors.basePackage("com.test.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("百度 APIs")
                .description("百度 APIs")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("百度","http://www.baidu.com",""))
                .version("1.0")
                .build();
    }
}
