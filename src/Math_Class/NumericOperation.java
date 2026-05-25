package Math_Class;

public class NumericOperation {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
       int max = Math.max(a,b);
       System.out.println(max);

       int abs = -11;
       int c =  Math.abs(abs);
       System.out.println(c);
       double d = 1.12;
       System.out.println(Math.ceil(d));
       System.out.println(Math.floor(d));
       System.out.println(Math.round(d)); //round
       int e = 144;
       System.out.println(Math.sqrt(e)); // find square root
       System.out.println(Math.pow(12,1.5)); //Find Power
       System.out.println(Math.log(10)); //Find log
        System.out.println(Math.log10(15)); //find log10
        System.out.println(Math.random());


        //generate random number between 0 to 10
        System.out.println((int)(Math.random() * 11));

        System.out.println(Math.nextAfter(1,2));
    }
}
