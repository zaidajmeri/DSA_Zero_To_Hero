package Exception_In_Java;


//Custom Exception Example Checked Exception
public  class InvalidAgeException extends Exception{
    public InvalidAgeException (String m) {
        super(m);
    }
}

 class geeks {
    public static void validate(int age)
            throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is must 18 or above");
        }
        System.out.println("valid age" + age); 
    }


    public static void main(String[] args) {
        try {
            validate(12);
        } catch (InvalidAgeException e) {
            System.out.println("Caught" + e.getMessage());
        }
    }
}