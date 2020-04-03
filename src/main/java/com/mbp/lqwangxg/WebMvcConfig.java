package com.mbp.lqwangxg;

import com.mbp.lqwangxg.configuration.Interceptor;
import com.mbp.lqwangxg.configuration.RequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Override  
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOrigins("*")  
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT") 
                .maxAge(3600);

    } 
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	    registry.addResourceHandler("/swagger-ui.html**")
	            .addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
	    registry.addResourceHandler("/webjars/**")
	            .addResourceLocations("classpath:/META-INF/resources/webjars/");

	    registry.addResourceHandler("/static/**")
	            .addResourceLocations("classpath:/static/");
	    
	    registry.addResourceHandler("/web/**")
        .addResourceLocations("classpath:/web/");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		InterceptorRegistration interceptorRegistration = registry.addInterceptor(new Interceptor());
		interceptorRegistration.addPathPatterns("/**");
		interceptorRegistration.excludePathPatterns("/error");
		interceptorRegistration.excludePathPatterns("/static/**");

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
    public FilterRegistrationBean filterRegist() {

        FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(new RequestFilter());
        frBean.addUrlPatterns("/*");

        return frBean;
    }
	
}
//package com.server;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.StringHttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//import java.nio.charset.Charset;
//import java.util.List;
//
//@Configuration
//public class WebMvcConfig extends WebMvcConfigurationSupport {
//
//	 @Bean
//	    public HttpMessageConverter<String> responseBodyConverter() {
//	        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
//	    }
//	    @Override
//	    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//	        converters.add(responseBodyConverter());
//	        addDefaultHttpMessageConverters(converters);
//	    }
//
//	    @Override
//	    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//	        configurer.favorPathExtension(false);
//	    }
//
//}
