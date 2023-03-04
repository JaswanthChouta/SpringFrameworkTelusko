package org.example.AppContextExample;


public class Tyre {

//Uncomment if you have to use constructor injection
//    public Tyre(String brand) {
//        this.brand = brand;
//    }

    private String brand;

    public String getBrand() {
        return brand;
    }

    //We used setter injection using property tag first. But we can also use Constructor injection.
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String display(){
        return "This is my Tyre";
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
