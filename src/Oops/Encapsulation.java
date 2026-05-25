package Oops;

import java.security.PrivateKey;

public class Encapsulation {
     String name;
    // Encaplusation is bundling data and methods into single unit
   // unit also known as class
    //in encapsulation we are hide the data using Private access specifier
    //encapsulation is also referred as data hiding
    //we use and hide data in encapsulation using getter and setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getBikename() {
        return Bikename;
    }

    public void setBikename(String bikename) {
        Bikename = bikename;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    private String color;
    private String Brand;
    private String Bikename;
    private int year;
    private int mileage;

   public void GoodMileage(int increment){
       mileage += increment;
   }

    public static void main(String[] args){

    }

}
