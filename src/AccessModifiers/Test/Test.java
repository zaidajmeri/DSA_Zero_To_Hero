package AccessModifiers.Test;

import AccessModifiers.School.Student;

public class Test {
    public static void main(String[] args){
//        Student student = new Student();
//        student.age = 21;
//        student.name = "Zaid";
//        System.out.println(student.age);


        Student.SayHello();

        School.getInstance();
    }

}
