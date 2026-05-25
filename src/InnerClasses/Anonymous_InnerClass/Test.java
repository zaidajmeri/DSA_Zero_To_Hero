package InnerClasses.Anonymous_InnerClass;

import javax.script.ScriptEngine;
import java.lang.classfile.ClassReader;

public class Test {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(150);
        CreditCard creditCard = new CreditCard(113156 );
        shoppingCart.processPayment(creditCard);


        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount){
                System.out.println("Paid " + amount + " Using PayPal");

            }
        });


    }
   }
