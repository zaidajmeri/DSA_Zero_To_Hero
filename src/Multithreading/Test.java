package Multithreading;

public class Test {

    public static void main(String[] args){

        //in this 2 thread working together
        world world1 = new world();
        world1.start();

        for (; ;){
            System.out.println("Hello");
        }



    }

}
