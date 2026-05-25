package Interface_in_detail.Animals;

public interface Animal {
    int MAX_AGE = 150;

    public abstract void eat();
    void sleep();


    //static interfaces
    public static void info(){
        System.out.println("This is interface info");
    }

    //default interface

    public default void run(){
        System.out.println("Animal is running");
    }
}
