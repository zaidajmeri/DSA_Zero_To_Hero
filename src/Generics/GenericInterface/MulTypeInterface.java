package Generics.GenericInterface;

public class MulTypeInterface<K,V> implements MultipleTypeParameterInterface<K, V>{
    private K key;
    private V value;


    public  MulTypeInterface(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public  static void  main(String[] args){
        MultipleTypeParameterInterface<String, Integer> multipleTypeParameterInterface = new MulTypeInterface<>("Age", 22);
        System.out.println(multipleTypeParameterInterface.getKey() + " : " + multipleTypeParameterInterface.getValue());
    }
}
