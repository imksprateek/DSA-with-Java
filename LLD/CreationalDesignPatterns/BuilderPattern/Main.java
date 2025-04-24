package LLD.CreationalDesignPatterns.BuilderPattern;

public class Main {
    //Builder pattern is used when you want to create object step by step

    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAstudentBuilder());

        Student student1 = director1.createStudent();
        Student student2 = director2.createStudent();

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}
