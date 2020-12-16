package Lambdas.ExampleOne;

public class Car {

    private String brand;
    private int date;

    Car(String brand, int date) {
        this.brand = brand;
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
