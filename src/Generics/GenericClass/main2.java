package Generics.GenericClass;

public class main2 {
    public static void main(String[] args){
        box1<Integer> box1 = new box1<>(); //box is now type safe
        box1.setValue(1);
        Integer  i = box1.getValue();
        System.out.println(i);


    }
}
