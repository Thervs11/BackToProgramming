package Encapsulation;

public class SingleProduct { // encapsulated class
    private String brand;

    public SingleProduct (String brand) { //setter method
        this.brand = brand;
    }

    public String getBrand() { //getter method
        return this.brand;
    }
}
