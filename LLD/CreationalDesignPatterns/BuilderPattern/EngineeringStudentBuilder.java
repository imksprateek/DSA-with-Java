package LLD.CreationalDesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> subs = new ArrayList();
        subs.add("Engineering");
        subs.add("DSA");
        subs.add("Mathematics");
        this.subjects = subs;
        return this;
    }
}
