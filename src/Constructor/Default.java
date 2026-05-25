package Constructor;

public class Default {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Default(){  //in this statement we overload the constructor
       this.age = 10;
    }

}
