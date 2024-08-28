package CreationalDesignPatterns.BuilderPattern;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        if(studentBuilder instanceof MBAstudentBuilder){
            return createMBAstudent();
        }

        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setName("Engineer").setAge(0).setRollNo(0).setSubjects().build();
    }

    private Student createMBAstudent(){
        return studentBuilder.setName("MBA").setAge(0).setRollNo(0).setSubjects().build();
    }
}
