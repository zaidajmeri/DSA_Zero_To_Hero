package Generics.GenericClass;

public class GenericType {
    public static void main(String[] args){
        Box<String> box = new Box<>(); // Box is now type safe
        box.setValue("Hello");
        String value = box.getValue();
        System.out.println(value);

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(28);
        Integer value1 = integerBox.getValue();
        System.out.println(value1);
    }
}
