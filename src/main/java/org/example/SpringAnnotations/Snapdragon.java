package org.example.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component //Default name of the component will be snapdragon i.e., non-qualified and decapitalised class name
public class Snapdragon implements MobileProcessor{

    @Override
    public void process() {
        System.out.println("World best CPU");
    }
}
