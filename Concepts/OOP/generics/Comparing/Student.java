package oops.generics.Comparing;

//Comparable is an interface
public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rolllno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    //compareTo() method from Comparable interface helps to customize comparison between objects (what to compare)
    @Override
    public int compareTo(Student o) {
        System.out.println("In compareTo method");
        int diff = (int) (this.marks - o.marks);
        return diff;

        //If diff <0, rahul has higher marks
//        If diff >0, prateek has higher marks
//        If diff == 0, both have equal marks
    }
}
