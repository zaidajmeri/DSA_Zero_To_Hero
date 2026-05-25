package Abstraction;

public abstract class Animal {
    private int age;
    private String name;

    public abstract void SayHello();

    public abstract void Running();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
