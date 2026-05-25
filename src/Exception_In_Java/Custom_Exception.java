package Exception_In_Java;

public class Custom_Exception {
    //Example Bank account
    private double Balance;

    public  Custom_Exception(double amount){
        this.Balance  = amount;
    }

    public void Withdraw(double amount) throws Exception{
        if(amount > Balance){
       throw new Insufficient_Funds_Exception( );
        }
        Balance -= amount;

    }


}
