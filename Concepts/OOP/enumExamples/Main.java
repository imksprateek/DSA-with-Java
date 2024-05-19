package oops.enumExamples;

public class Main {

    //All the enums by defult extend java.lang.enum class. So we cannot extend enum with anything else since multiple inheritance is not allowed
    //But enum can implement any number of interfaces
    // abstract methods are not allowed in enum. Body is required
    enum Week implements Hello {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants
        //Everything in enum is public, static and final by default
        //Since it's final, child enums cannot be created
        //Type is week

        Week() {
            System.out.println("Constructor called for " + this);
        }
        //Constructor is not public or protected, only private or default
        //We cannot invoke this constructor explicitly. It only happens when we try to access something
        //Because if it's public it'll allow the initialization of more than one objects. We don't want to create new objects explicitly since that doesn't align with enum concept

        @Override
        public void hello() {
            System.out.println("Hey how are you?");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Tuesday;
        //The above internally does - public static final week Tuesday = new Week();
        //If we access one enum constant it'll call all the constants. Hence constructor gets executed for all enum constants when any one constant is accessed

        week.hello();
        System.out.println(week.valueOf("Monday"));
        //The above returns the enum constant

//        System.out.println(week);
//        System.out.println();
//
//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
//
//        System.out.println();
//        System.out.println(week.ordinal());
        //ordinal method gives the position of enum declaration. In this case value assigned to week is Tuesday, which is at index 1 (index 0 is Monday)
    }
}
