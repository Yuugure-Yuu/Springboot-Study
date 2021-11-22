package com.kuang.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

// 扩展 springmvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {



    @Bean
     public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }



/*    // 视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("//kuang").setViewName("test";);

    }*/

    /*
    // ViewResolver 实现了视图解析器接口的类，我们就可以把它视作视图解析器
    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }


    // 自定义了一个自己的视图解析器MyViewResolver
    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
*/

}
