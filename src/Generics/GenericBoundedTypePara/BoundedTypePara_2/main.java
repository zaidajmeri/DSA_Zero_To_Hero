package Generics.GenericBoundedTypePara.BoundedTypePara_2;


//bounded type parameters in generic interface to restrict the types that user as arguments
// In Number Integer Double can be used

interface printble{
    int print();
}


class MyNum extends Number implements printble{
    private final int val;

    public MyNum(int val){
        this.val = val;
    }

    @Override
    public int print() {
        System.out.println("my number " + val);
        return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class boxx<T extends  Number & printble>{ //bounded type param can be multiple but first should be class and then Interface
    private T item;

    public T getItem() {
        return item;
    }

//    public void setItem(T item) {
//        this.item = item;
//    }

    public boxx(T item){
        this.item =item;
    }
    public void display(){
        item.print();
    }
}

public class main {
    public static void main(String[] args){

        MyNum num = new MyNum(22);
        boxx<MyNum> box = new boxx<>(num);
        box.display();
    }
}
