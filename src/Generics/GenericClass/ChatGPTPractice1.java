package Generics.GenericClass;

public class ChatGPTPractice1 {
        public static void main(String[] args){

            //String
            Box<String> b1 = new Box<>();
            b1.setValue("Hello MY Name is Zaid");
            String value = b1.getValue();
            System.out.println(value);
            b1.printType();

            //Integer
            Box<Integer> b2 = new Box<>();
            b2.setValue(22);
            Integer value1 = b2.getValue();
            System.out.println(value1);



        }
}
