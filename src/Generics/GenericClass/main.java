package Generics.GenericClass;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
//        ArrayList list = new ArrayList();
//        list.add("hello");
//        String str = (String) list.get(0);

        //befor java 5 introduce Generics this issue occurs

        //after new feature as Generics

        ArrayList <String> list = new ArrayList<>();
        list.add("Hello ");

        list.add("My name is Zaid Ajmeri ");

        list.add("I ❤️ Java");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){ }
        System.out.println(str2);
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){ }  //no need to add thread here i am just enjoying it so...
        System.out.println(str3);
    }
}
