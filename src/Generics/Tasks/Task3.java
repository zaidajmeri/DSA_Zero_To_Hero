package Generics.Tasks;

public class Task3 <T> {
    private T value;

    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Task3<Integer> task3 = new Task3<>();
        Task3<String> taskSTR = new Task3<>();

        taskSTR.setValue("Hello My Name is Zaid");
        System.out.println(taskSTR.getValue());

        task3.setValue(28);
        System.out.println(task3.getValue());

    }
}


