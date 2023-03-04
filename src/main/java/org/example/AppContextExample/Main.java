package org.example.AppContextExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike();
        Car car = new Car();

//        Instead of creating objects by ourselves all the time, we can use ApplicationContext or BeanFactory classes
//        from Spring framework to create the obj for us. ApplicationContext is superset of BeanFactory(used when small
//        application)So simply do as below.

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle vehicle = (Vehicle) context.getBean("bike"); //
//        getBean returns u object. So we type case it to type Vehicle
//        This is one way. We can also use annotations. For this we have to use @Component in Bike or Car class.
//        And configure as shown in spring.xml. The other is java based config. (@Autowired)
        System.out.println("Component Annotation Based Config:");
        vehicle.drive();

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println("Setter Injection using XML Based COnfig:");
        System.out.println(t); //example to set properties of an object using xml based config. If we dont set brand will be null

        Car car1 = (Car) context.getBean("car");
        System.out.println("Autowired Annotation Based Config:");
        car1.drive();





    }
}