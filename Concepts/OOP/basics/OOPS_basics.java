package oops.basics;

public class OOPS_basics {
    public static void main(String[] args) {
        Student kunal = new Student(3, "Kunal", 65.3f);
        System.out.println(kunal.marks);
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
}
