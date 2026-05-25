package InnerClasses.Anonymous_InnerClass;

public class CreditCard implements Payment{

    //credit card number
    private int creditCardNum;

    public CreditCard(int creditCardNum){
        this.creditCardNum =creditCardNum;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Using Credit Card ");
    }
}
