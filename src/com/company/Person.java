package com.company;

public abstract class Person implements Speakable {
    private String name;
    private String surname;
    //protected  String protectedField;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //metoda abstrakcyjna, aby ją użyć trzeba w klasie dziedziczącej sobie ją zaimplementować
    //każda klasa która dziedziczy po klasie abstrakcyjnej musi mieć zaimplementowane metody abstrakcyjne
    public  abstract  String saySomething(String str);
    @Override
    public String toString() {
        return name + " " + surname ;
    }

}
