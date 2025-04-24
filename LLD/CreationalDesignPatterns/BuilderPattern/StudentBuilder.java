package LLD.CreationalDesignPatterns.BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {
    public String name;
    public int age;
    public int rollNo;
    public String fathersName;
    public String mothersName;
    public List<String> subjects;

    public abstract StudentBuilder setSubjects();

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }


    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }


    public StudentBuilder setFathersName(String fathersName) {
        this.fathersName = fathersName;
        return this;
    }

    public StudentBuilder setMothersName(String mothersName) {
        this.mothersName = mothersName;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
