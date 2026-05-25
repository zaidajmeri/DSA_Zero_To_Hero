package Encapsulation;

public class EncapsulationInDetails {
    String name;
    String RollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    private  int age;

//Set age
    public void  setAge(int age){
        if (age < 0 ) {
            age = 0;
        }
        this.age = age;
    }

    //get age
    public int getAge(){
        return this.age;
    }






    public static void main(String[] args){

    }

}
