package Interface_in_detail;

import Interface_in_detail.Animals.Animal;
import Interface_in_detail.Animals.Cat;
import Interface_in_detail.Animals.Dog;
import Interface_in_detail.Devices.SmartPhone;

public class test {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        System.out.println(Dog.MAX_AGE);


        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        System.out.println(Cat.MAX_AGE);

        Animal.info();

        //Animal.run() // this is not run because of default
        dog.run(); //this is will run

        //Multiple Inheritance Example

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("1234567996");
        smartPhone.endCall();
        smartPhone.PlayMusic();
        smartPhone.StopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}
