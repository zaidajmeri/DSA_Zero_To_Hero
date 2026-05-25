package Oops;

public class CarTest {
    public static void main(String[] args){
        car Car = new car();
        Car.color = "White";
        Car.speed = 40;
        Car.brand = "Tata";
        Car.year = 2024;
        Car.model = "safari";

        Car.accelarte(1);
        System.out.println(Car.speed);
    }
}
