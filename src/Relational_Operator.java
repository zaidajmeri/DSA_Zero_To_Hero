public class Relational_Operator {
    public static void main(String[] args) {
        //relational Operators Compare two values and return a boolean result
        int a = 1;
        int b = 2;
        boolean c = a< b;
        boolean c1 = a ==b ;
        boolean c2 = a != b;
        boolean c3 = a >=b;
        boolean c4 = a <= b;
        System.out.println("less then " + c );
        System.out.println("Double Equal " + c1);
        System.out.println("Not Equal " + c2);
        System.out.println("Greater than or equal to " + c3);
        System.out.println("Less than or equal to " + c4);

        //we can compare two string also in relational operator
        char a1 = 'Z';
        char a2 = 'B';
        System.out.println('z' + 0);
        System.out.println('B' + 0);
        boolean a3 = a1 < a2;
        System.out.println("Checking with ascii number  " +a3 );


        //lets learn new example
        String str1 = "Pool";
        String str2 = "Pool";
        System.out.println(str1 == str2); //why this gives true in output because both string values are stored
        //in string pool

        String str3 = new String("Pool");
        System.out.println(str3 == str2); //why this gives false in output because str3 is in heap memory and str2 is in string pool






    }
    }
