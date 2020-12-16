package lambdas.example_with_generic;

public class Car {
    private String brand;
    private  int age;

    public Car(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", age=" + age +
                '}';
    }
}
