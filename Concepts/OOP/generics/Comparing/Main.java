package Concepts.OOP.generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student prateek = new Student(700, 86.32f);
        Student rahul = new Student(701, 99.21f);
        Student arpit = new Student(702, 91.23f);
        Student karan = new Student(703, 82.13f);
        Student sachin = new Student(704, 67.89f);

//        if (prateek.compareTo(rahul) > 0) {
//            System.out.println("Prateek has more marks");
//        } else if (prateek.compareTo(rahul) < 0) {
//            System.out.println("Rahul has more marks");
//        } else {
//            System.out.println("Equal");
//        }

        Student[] list = {prateek, rahul, arpit, karan, sachin};
        //We can override the Arrays.sort method to compare however we want
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks - o2.marks);
//            }
//        });

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        //If we donot override Arrays.sort, It is stilll sorted based on marks because there's marks in compareTo() method of Student class
//      //If we donot override Arrays.sort and the compareTo() method is removed it'll throw an error, because java doesn't know what to compare
        // Either compareTo() in Student class or overriding Arrays.sort() one of them is required
    }
}
