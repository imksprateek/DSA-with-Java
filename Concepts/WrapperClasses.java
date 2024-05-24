package Concepts;

public class WrapperClasses {
    //Java program to convert primitive into objects
//Autoboxing example of int to Integer
    public static void main(String args[]) {
//Converting int into Integer
        int a = 20;
//            Integer i=Integer.valueOf(a);//converting int into Integer explicitly
        Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally
        j--;
        System.out.println(a + " " + " " + j);
    }
}

