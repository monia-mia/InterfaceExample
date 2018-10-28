package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Person p = new Person("Jan", "Kowalski"); not allowed because of abstract class

        //anonimowa klasa wewnętrzna (działa tylko w tym miejscu, w main
//        Person p = new Person("","") {
//            @Override
//            public String saySomething(String str) {
//                return "Wew: " + str;
//            }
//        };

        Speakable speakable = new Speakable() {
            @Override
            public void speak(String str) {
                System.out.println("Wew Speakable: " + str);
            }

            @Override
            public String speakMessage(String str) {
                return "Wew Speakable: " + str;
            }
        };

        //System.out.println(p.getName() + " " + p.getSurname());
        Student s1 = new Student("Ala", "MaKota", "23");
        Student s2 = new Student("Iza", "Elika", "20");

        //System.out.println(s1.getName() + " " + s1.getSurname() +", " + s1.getStudentId());

        Person p2 = new Student("Jankov", "Kovalski", "1234"); //object student is pointed by master class Person
        //System.out.println(p2.getName() + " " + p2.getSurname() +", " + ((Student)p2).getStudentId());  //(Student) - converting person to student before getting variable
        //if method from parent class will be override in child class, then compiler do method from child class


        Teacher t1 = new Teacher("Piotr", "Trudny", 2222);
        Person t2 = new Teacher("Aleksaner","Brzydal", 3333);

//        Person[] persons = new Person[3];
//        persons[0] = p;
//        persons[1] = s1;
//        persons[2] = t1;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(persons[i].saySomething("Yay " + i));
//
//        }


        Speakable[] speakables = new Speakable[3];
        speakables[0] = speakable;
        speakables[1] = s1;
        speakables[2] = t1;

        for (int i = 0; i < 3; i++) {
            System.out.println(speakables[i].speakMessage("Yay " + i));
            speakables[i].speak("Oh yay " + i +"\n");

        }
    }
}
