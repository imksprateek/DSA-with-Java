package LLD.CreationalDesignPatterns.BuilderPattern;

import java.util.List;

public class Student {
    public String name;
    public int age;
    public int rollNo;
    public String fathersName;
    public String mothersName;
    public List<String> subjects;

    public Student(StudentBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.rollNo = builder.rollNo;
        this.fathersName = builder.fathersName;
        this.mothersName = builder.mothersName;
        this.subjects = builder.subjects;
    }
}
