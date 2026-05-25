package Constructor;

public class Parameterized {
    private String name;
    private int rollno;
    private int age;

    public Parameterized(String name, int rollno, int age){     //this is call parameterized constructor
        this.age= age;
        this.name = name;
        this.rollno = rollno;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
