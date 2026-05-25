package Polymorphism;

public class polymorphism {
    //polymorphism is a core concept in OOP that allows methods to do different things based on the object it is
    // acting upon ,even though the method name and its signature might be the same
    //method name and signature name same ho fir bhi different kaam karega
    //there is 2 polymorphism 1. Compile time polymorphism 2. Run time polymorpism

    //compile time polymorphism also known as method overloading
    //compile time polymorphism me compile time me hi decision lia jayega ke konsa method call kar rahe he
    // poly = many , morph = forms == manyforms

    //two integers
    public int add(int a , int b){
        return a + b;
    }

    //three integers
    public int add(int a, int b, int c){
        return a + b + c;
    }

    //add double values
    public double add(double a, double b){
        return a + b;
    }

    //this is example is compile time polymorphism



}
