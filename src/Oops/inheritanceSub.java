package Oops;

public class inheritanceSub extends inheritanceSuper  {
    String breed;

    public static void main(String[] args){
        inheritanceSub SubClass = new inheritanceSub();
        SubClass.name = "zaid";
        System.out.println(SubClass.name);
    }
}
