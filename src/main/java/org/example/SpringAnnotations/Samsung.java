package org.example.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    @Qualifier("snapdragon") // We can use this anno to specify which specific obj u want if they implement same interface
    // Also we have @Primary, you can use this above the class- which to get that obj with same case as above
    //If I keep @Primary in Snapdragon I will get o/p as Worlds best CPU, if I dont use it depends on component name provided in Qualifier anno.
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Octa Core,4gb ram, 12 MP Cam");
        cpu.process();
    }
}
