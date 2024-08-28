package CreationalDesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAstudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects(){
        List<String> subs = new ArrayList();
        subs.add("Business");
        subs.add("Commerce");
        subs.add("Accounts");
        this.subjects = subs;

        return this;
    }
}
