package Encapsulation;

import Oops.Encapsulation;

public class Test
{
    //Encapsulation Basic example
    public static void main(String[] args){
        EncapsulationInDetails e = new EncapsulationInDetails();
        e.name = "Zaid";
        e.setAge(22);
        System.out.println(e.getAge());



        //Bank Application Using Encapsulation Example
        BankApplication bankApplication = new BankApplication();
        bankApplication.setAccountNumber(1231654);
        bankApplication.deposit(-10);
        bankApplication.withdraw(10);
        bankApplication.deposit(100);
        bankApplication.withdraw(10);
        System.out.println(bankApplication.getBalance());


    }
}
