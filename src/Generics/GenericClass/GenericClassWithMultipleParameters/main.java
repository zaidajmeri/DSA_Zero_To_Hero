package Generics.GenericClass.GenericClassWithMultipleParameters;

public class main {
    public static void main(String[] args)
    {
        pair<String, Integer> pair = new pair<>("Age", 22);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
