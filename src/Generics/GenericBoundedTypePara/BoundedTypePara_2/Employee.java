package Generics.GenericBoundedTypePara.BoundedTypePara_2;

import java.lang.Comparable;

class Employee implements Comparable<Employee>{

    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);

    }

    public static void main(String[] args){
        Employee employee = new Employee("Zaid", 22);
        System.out.println(employee.name);
        System.out.println(employee.age);
    }

}


