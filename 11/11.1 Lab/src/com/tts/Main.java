package com.tts;

abstract class Employee {

    int salary;
    String grade;

    public Employee(int salary, String grade) {
        this.salary = salary;
        this.grade = grade;
    }

    public Employee() {

    }

    abstract int getSalary();
    abstract void setSalary(int salary);
    abstract String getGrade();
    abstract void setGrade(String grade);

    void label() {
        System.out.printf("Employee's data:\n");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", grade='" + grade + '\'' +
                '}';
    }
}


class Engineer extends Employee {
    private int salary;
    private String grade;

    public Engineer(int salary, String grade) {
        super(salary, grade);
    }

    public Engineer() {
        super();
    }

    @Override
    int getSalary() {
        return salary;
    }


    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    String getGrade() {
        return grade;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }
}

class Manager extends Employee {
    private int salary;
    private String grade;

    public Manager(int salary, String grade) {
        super(salary, grade);
    }

    public Manager() {

    }

    @Override
    int getSalary() {
        return salary;
    }


    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    String getGrade() {
        return grade;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
//        for(int i=0;i<n;i++){
//            String[] input = sc.nextLine().split(" ");
//            if(input[0].equals("ENGINEER")){
//                Engineer e = new Engineer();
//                e.setSalary(Integer.parseInt(input[2]));
//                e.setGrade(input[1]);
//                e.label();
//                System.out.println("GRADE : " + e.getGrade());
//                System.out.println("SALARY : " + e.getSalary());
//            }
//            if(input[0].equals("MANAGER")){
//                Manager e = new Manager();
//                e.setSalary(Integer.parseInt(input[2]));
//                e.setGrade(input[1]);
//                e.label();
//                System.out.println("GRADE : " + e.getGrade());
//                System.out.println("SALARY : " + e.getSalary());
//            }
//        }

Engineer e = new Engineer(50000, "D");
//employee1.setGrade("C");
//System.out.println(employee1.getGrade());
//System.out.println(employee1.toString());
        e.label();
    }
}


//class Adder extends Calculator {
//    @Override
//    public int add(int a, int b) {
//        return a + b;
//    }
//}
//
//abstract class Calculator {
//    public abstract int add(int a, int b);
//}
// Adder calc1 = new Adder();
//System.out.println(calc1.add(2,10));