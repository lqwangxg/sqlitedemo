package com.mbp.lqwangxg;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Swagger2配置类
 *
 * @author lqwangxg
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig
{
    @Value("${server.servlet.context-path}")
    private String projectName;
    @Value("${swagger.is.enable}")
    private boolean swagger_is_enable;

    @Bean
    public Docket createRestApi() {

        ParameterBuilder parameterBuilder = new ParameterBuilder();
        parameterBuilder.name("token").description("User token")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build();
        List<Parameter> parameters = new ArrayList<Parameter>();
        parameters.add(parameterBuilder.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(swagger_is_enable)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mbp.lqwangxg.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(parameters);
    }
    /**
     * 展示文档的基本信息
     *
     * @return
     */
    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title(projectName)
                .description("restfulスタイル")
                .termsOfServiceUrl(projectName +"/swagger-ui.html")
                .version("1.0")
                .build();
    }
}
