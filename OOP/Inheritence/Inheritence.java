package oops.Inheritence;

import oops.basics.OOPS_basics;

public class Inheritence {
    public static void main(String[] args) {
        Student kunal = new Student(3, "Kunal", 65.3f);
        System.out.println(kunal.marks);

        Person prateek = new Person("K S Prateek");

        prateek.getParams();

        Person rahul = new Person("Rahul");
        rahul.getParams();
    }

    static class Student {
        int rno;
        String name;
        float marks;

        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }

    public static class Human {
        static int hands = 2;
        static int head = 1;

        static int population = 0;
    }

    public static class Person extends Human {
        static String Name;

        public Person(String name) {
            Name = name;
            population += 1;
        }

        public void getParams() {
            System.out.println("Hands:" + Person.hands);
            System.out.println("Head:" + Person.head);
            System.out.println("Name:" + Person.Name);
            System.out.println("Population:" + Human.population);
        }
    }

}
