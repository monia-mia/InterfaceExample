package com.company;

public class Teacher extends Person{

    private int salary;

    public Teacher(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public String saySomething(String str) {
        return "Teacher says " + str;
    }

    @Override
    public String toString() {
        return super.toString() +" " + salary + "";
    }

    @Override
    public void speak(String str) {
        System.out.println("Teacher: "+ str);
    }

    @Override
    public String speakMessage(String str) {
        return "Teacher: "+ str;
    }
}
