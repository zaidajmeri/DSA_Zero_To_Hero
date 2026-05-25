package Exception_In_Java;

public class Test {
    public static void main(String[] args) {
        Custom_Exception customException = new Custom_Exception(10);
        try {
            customException.Withdraw(11);
            System.out.println("Withdraw Success");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
