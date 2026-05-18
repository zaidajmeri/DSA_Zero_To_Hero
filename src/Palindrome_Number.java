public class Palindrome_Number {
    public boolean isPalindrome(int x){
        if (x < 0) return false;
        int xCopy = x;
        int rev =  0;
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev == xCopy;
    }

    public static void main(String[] args)
    {
        Palindrome_Number p  = new Palindrome_Number();
        System.out.printf("Is Number is Palindrome ? : " + p.isPalindrome(4554));
    }
}
