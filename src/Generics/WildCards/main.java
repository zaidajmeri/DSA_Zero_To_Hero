package Generics.WildCards;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main{
    public static void main(String[] args){

    }

    public static  <T> T getFirst(ArrayList<T> list){
        return list.get(0);

    }

    public static <T> void copy(ArrayList<T> source, ArrayList<T> destination){
        for (T item :source){
            destination.add(item);
        }
    }

    public static void processElement(List<?> elements){
        for (Object element : elements){
            System.out.println(element);
        }
    }
}
