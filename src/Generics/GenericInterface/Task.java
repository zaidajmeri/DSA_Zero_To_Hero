package Generics.GenericInterface;


interface container<T> {
    void add(T item);
    T get();

}
public class Task<T> implements container<T>{

    private T item;


    @Override
    public void add(T item) {
        this.item = item;
    }



    @Override
    public T get() {

        return item;
    }

    public static void main(String[] args) {
        Task<Integer> task = new Task<>();
        task.add(28);
        System.out.println(task.get());
    }
}
