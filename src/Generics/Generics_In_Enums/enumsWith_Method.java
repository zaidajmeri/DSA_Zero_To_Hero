package Generics.Generics_In_Enums;


enum Artithmatic{
    ADD,SUBTRACT,MULTIPLY,DIVIDE;

    public <T extends Number> double apply(T a, T b){
        switch (this) {
            case ADD -> {
                return a.doubleValue() + b.doubleValue();
            }
            case SUBTRACT -> {
                return a.doubleValue() - b.doubleValue();
            }
            case MULTIPLY -> {
                return a.doubleValue() * b.doubleValue();
            }
            case DIVIDE -> {
                return a.doubleValue() / b.doubleValue();
            }
            default ->{
                throw new AssertionError("Unknown Operation " + this);
            }
        }
    }
}


public class enumsWith_Method {
    public static void main(String[] args){
         double result1 =   Artithmatic.ADD.apply(10,20);
         double result2 = Artithmatic.SUBTRACT.apply(20,20);
         double result3 = Artithmatic.MULTIPLY.apply(20,20);
         double result4 = Artithmatic.DIVIDE.apply(20,10);


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
