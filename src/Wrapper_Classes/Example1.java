package Wrapper_Classes;
import StaticInDetail.Student;

public class Example1 {
    public static void main(String[] args) {
        Student x = new Student();
        x.id =1;
        fun(x);
        System.out.println(x.id);
    }

    private static void fun(Student a){
        Student student = new Student();
        student.id = 2;
        a = student;
    }


}
