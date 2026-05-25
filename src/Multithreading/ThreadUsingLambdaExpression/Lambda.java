package Multithreading.ThreadUsingLambdaExpression;

//those interface who have single abstract method that called functional interface
//ek hi esa method jiski koi body nai he unko bolte he runnable interface

//what is lambda expression -> Lambda Expression is an anonymous function
//how to use - () -> using this

//lambda expression can be assign to lambda expression's objects

public class Lambda {
    public static void main(String[] args){
        Runnable runnable = () -> {          //functional interface ke samne anonymouse function likha he
             System.out.println("this is lambda Expression");
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
