package Generics.GenericInterface;

public class GenericInterface<T> implements InterfaceContainer<T>{

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return null;
    }
}
