package Generics.WildCards;

import java.util.List;

 public class upperBound {
    public static double sum(List<? extends Number> numbers){
        double total = 0.0;
        for (Number number : numbers){
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args){
        List<Integer> integerList = List.of(1,2,3);
        List<Double> doubles = List.of(1.1,2.2,3.3);

        System.out.println("Sum of Integer" + sum(integerList));
        System.out.println("Sum of strings" + sum(doubles));
    }
}
