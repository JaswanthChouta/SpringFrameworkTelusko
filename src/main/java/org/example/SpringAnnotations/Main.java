package org.example.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        //we have to create a class to provide configurations to be provided as param for above method


        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
