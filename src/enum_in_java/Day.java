package enum_in_java;


public enum Day {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");





    private Day(String lower) {
        System.out.println("construct called");
        this.lower = lower;
    }

    public String getLower() {
        return lower;
    }

    private String lower;

    //methods in enum
    public void display() {
        System.out.println("Today is Monday " + this.name());
    }
}
