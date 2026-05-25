package Generics.GenericClass;

public class box1<T> //this can be only single letter
{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
