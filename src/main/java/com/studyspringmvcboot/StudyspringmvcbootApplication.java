package com.studyspringmvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ss
 */
//@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication()
public class StudyspringmvcbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyspringmvcbootApplication.class, args);
    }

//    @Bean
//    public InternalResourceViewResolver internalResourceViewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/user/");
//        viewResolver.setSuffix(".html");
//        return viewResolver;
//    }
}
