package InheritanceInDetail.human;

public class Grandparent {
    private String name;
    private int age;
    private boolean hasSuperPower;

    public boolean isHasSuperPower() {
        return hasSuperPower;
    }





    public Grandparent(){
        System.out.println("Grandparent consturctor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
