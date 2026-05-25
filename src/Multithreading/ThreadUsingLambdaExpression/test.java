package Multithreading.ThreadUsingLambdaExpression;

public class test {
    public static void main(String[] args){
        Student engineerStd = new Student() {
            @Override
            public String getBio(String name) {
                return name  + " is MCA Student";
            }
        };

        Student financeStd =  name -> {   // we can remove brackets if we have only one parameter
            return name + " is Finance Student ";
        };

        String engStd = engineerStd.getBio("Zaid");
        System.out.println(engStd);

        String FinStd = financeStd.getBio("Kaif");
        System.out.println(FinStd);

    }
}

