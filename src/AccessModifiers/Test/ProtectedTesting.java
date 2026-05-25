package AccessModifiers.Test;

import AccessModifiers.Zoo.Dog;

import java.util.Dictionary;

public class ProtectedTesting {


    public static void main(String[] args){
        Dog dog = new Dog("Tommy");
        dog.makeSound();
        dog.setDogSound("Woof ");
        dog.makeSound();
        dog.wagTail();


    }



}
