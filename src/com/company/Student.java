package com.company;

public class Student extends Person{

    private String studentId;

    public Student(String name, String surname, String studentId) {
        super(name, surname); //"super" word means class from which our class inherit
        this.studentId = studentId;

    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String saySomething(String str) {
        return "Student says " + str;
    }

    @Override
    public String toString() {
        return super.toString() +" " + this.studentId ;
    }


    @Override
    public void speak(String str) {
        System.out.println("Student: "+ str);
    }

    @Override
    public String speakMessage(String str) {
        return "Student: " + str;
    }
}
