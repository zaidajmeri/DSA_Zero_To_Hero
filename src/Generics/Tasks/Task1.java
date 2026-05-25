package Generics.Tasks;


//Create a class Box
//Make it generic <T>
//Create a private variable value
//Create a constructor to store value
//Create a method getValue() that returns value
//In main(), create:
//one Box<Integer>
//one Box<String>
//Print both values using getValue()

//generic class
public class Task1 <T> {
    private T value;

    public T getValue(){
        return value;
    }


    public void setT(T value) {

    }

    public  Task1(T value){
        this.value = value;
    }

    public static void main(String[] args){
        Task1 <Integer> task1 = new Task1<>(12);
        System.out.println(task1.getValue());

        Task1 <String> task2 = new Task1<>("Hello");
        System.out.println(task2.getValue());
    }
}
