package Oops;
//object oriented is about creating object that contain both data and method
//in java classes are bluprint
// we have to create blueprint of any class and code written in another file
//in oop we have Encapsulation, Abstraction, Polymorphism & Inheritance
//in oop we deal with classes and objects



public class car {

    String color;
    String brand;
    String model;
    int year;
    int speed;

    // in oops we use  object behaviour as method
    public void accelarte(int increment){
        speed += increment;

    }

    public void brake(int decrement){
        speed -= decrement;
        if (speed < 0){
            speed = 0;
        }
    }



}
