package InheritanceInDetail;

import InheritanceInDetail.human.child;
import InheritanceInDetail.human.parent;

public class test {
  public static void main(String[] args){
      Dog dog = new Dog();
      dog.setAge(2);
      System.out.println("age of dog is " + dog.getAge());
        dog.setName("Tommy");
        System.out.println(dog.getName());
        dog.eat();
        dog.sayHello();



        //human example

      //this example call multilevel or multiple inheritance
        child c = new child();
        c.setName("Zaid");
        c.setAge(22);
        System.out.println(c.getAge());
        System.out.println(c.getName());


        parent p = new parent();
        p.setName("Latif");
        p.setAge(46);


  }



}
