package ge.constructors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/resources/");
        registry.addResourceHandler("/static/css/**").addResourceLocations("classpath:static/css/");
        registry.addResourceHandler("/static/img/**").addResourceLocations("classpath:static/img/");
        registry.addResourceHandler("/static/js/**").addResourceLocations("classpath:static/js/");
        registry.addResourceHandler("/lib/**").addResourceLocations("classpath:lib/");
    }
}
