package org.example.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example.SpringAnnotations") //If multiple packages separate them by comma
public class AppConfig {

//    @Bean //To say that this method returns bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new Snapdragon();
//    }
//    Instead of writing all the above methods we can use @Component tag in the class that you want to autowire in other classes
//    and insert ComponentScan tag in the config class as shown in this class
}
