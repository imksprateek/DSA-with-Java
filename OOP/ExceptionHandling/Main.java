package oops.ExceptionHandling;

public class Main {
    //The Throwable class inherits the Object class
    //Throwable class handles exceptions
    // There are two types of Throwables, Exceptions and Errors
    //Errors can't be handled by programs, Eg- Stack Overflow error
    //But exceptions can be handled by the program. Eg- Divide by zero exception, Null pointer exception. Exceptions are the situations that change the flow of the program
    //Exceptions are of two types - Checked(Occur during compile time) and Unchecked(Occur during Runtime)

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a / b;
//        try {
//            divide(a, b);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("This will always execute no matter if there's an exception or not");
//        }

//        try {
//            divide(a, b);
//        } catch (Exception e) {
//            System.out.println("Normal exception");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            //If we do this, it'll throw an error. Because ArithmeticException is already caught in Exception since that's a subclass of Exception class
//        // So, a Strict rule should come above
//        } finally {
//            System.out.println("This will always execute no matter if there's an exception or not");
//        }

        try {
//            divide(a, b);
            //The below is Mimicking an exception (Not necessary in this scenario)
//            throw new Exception("Just for fun");
            String name = "Prateek";
            if (name.equals("Prateek")) {
                throw new MyException("Your name is Prateek. Access Denied!!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            //If ArithmeticException occurs it'll call this
        } catch (Exception e) {
            System.out.println("Normal exception");
            //If any other exception occurs it'll call this
        } finally {
            System.out.println("This will always execute no matter if there's an exception or not");
        }
        //There can only be one finally. We cannot create multiple
    }

    //      ArithmeticException is a subclass of Exception
    //      throws keyword is used to declare that it may throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            //When you want to explicitly throw an exception
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }

}
