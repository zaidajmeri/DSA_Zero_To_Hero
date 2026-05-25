package InnerClasses.Anonymous_InnerClass;

public class ShoppingCart {
    private double totalAmount;

    //constructor
    public ShoppingCart(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}
