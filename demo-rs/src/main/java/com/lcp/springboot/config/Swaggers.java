package com.lcp.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <b><code>Swaggers</code></b>
 * <p>
 * <p/>
 * <p>
 * Description
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 16:19.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */
@Configuration
@EnableSwagger2
public class Swaggers {
    @Bean
    public Docket createRestApi() {
        StopWatch watch = new StopWatch();
        watch.start();
        Docket swaggerSpringMvcPlugin = new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo-rs")
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .select().apis(RequestHandlerSelectors.basePackage("com.lcp.springboot"))
                .paths(PathSelectors.any())
                .build();
        watch.stop();
        return swaggerSpringMvcPlugin;
    }

    private ApiInfo apiInfo() {
        String title = "Demo RESTful API Documentation springboot项目RESTfull API文档";
        String description = "DemoSpringboot RESTful API";
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .version("1.1.0")
                .build();
    }
}
