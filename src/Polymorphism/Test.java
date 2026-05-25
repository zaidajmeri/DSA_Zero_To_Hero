package Polymorphism;


public class Test {
    public  static  void main(String[] args){

        //compile time polymorphism
     polymorphism p = new polymorphism();
     System.out.println(p.add(2,5));
     System.out.println(p.add(2,2,2));
     System.out.println(p.add(2.5,2.5));

     //Run time polymorphism
        RunTimePolymorphism Parent = new RunTimePolymorphism();

        RunTimePolymorphism r =  new subclass(); //this is also called upcasting
        r.UniName();
        //this example indicates runtime polymorphism there is parent class is reference and subclass is object thats
        // why
        // subclass statement run
        // but relation is important
        //runtime polymorphism is done by method overriding
        //also call dynamic method dispatch





    }



}
