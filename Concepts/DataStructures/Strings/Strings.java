package Concepts.DataStructures.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a = "Prateek";
        String b = "Prateek";

        //These 2 strings have the same value. Both a and b point to the same object "Prateek" which is in String pool which is in the heap memory
        //Java creates objects only once and if the assigned values are the same, the new variable will just point to the object already present in String pool

        //Strings are immutable in Java. Once assigned can't be changed at the same reference
        //To change strings we need to explicitly mention it. that is, create a new object with new keyword
        //When we do this, the object is not stored in string pool but in the heap memory outside the string pool

        String c = new String("Prateek");

        // "==" operator returns true if the operands have the same reference (Point to the same memory location in heap)
        System.out.println(a==b);
        System.out.println(a==c);

        //To compare values, use .equals() method
        System.out.println(a.equals(c));

        //String concatenation operator
        //for string objects, the '+' operator is overloaded. That means the operator provides more functionalities like concatenation. It is the only operator overloaded in java. We can't customize what the '+' operator does like in C++ or python because that results in poor code
        System.out.println("I am " + "Batman");

        //When a string is concatenated with an object, the object's toString() method is called and it's string form is concatenated
        System.out.println("This is an " + new ArrayList<>());

        //In Java, to use '+' operator, either both operands should be a primitive or atleast one of them should be a string.
//        System.out.println(new ArrayList<>() + new Integer(43));
//        The above line will resule in an error due to the stated rule

        //Instead, if we write like this, it works because one of the operands is a string
        System.out.println(new ArrayList<>() + " " + new Integer(43));

//        If one of the datatypes is String, the answer will be String
        System.out.println("This is String " + 'S');


//        String Performance
//        When we keep concatenating a string in a loop, everytime a new object is being created and so many previous states of string will have nothing pointing to it, leading to a wastage of memory. StringBuilder objects are mutable unlike Strings
        String sample = new String();
        for(int i=0; i<26; i++){
            sample += (char)('a'+i);
        }
        System.out.println(sample);

//        Hence to solve this issue and make changes in a single object, we need to use StringBuilder. This makes changes in a single object instead of creating a new one each time unlike Strings
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<26; i++){
            stringBuilder.append((char)('a'+i));
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.deleteCharAt(0));
        System.out.println(stringBuilder.reverse());

//        String Methods
        String name = "Prateek";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
//        When we call all these methods on Strings, it's actually creating a new object and not modifying the original String
        System.out.println(name);

        //some other String methods
        //.trim() removes one leading and one trailing whitespace and other control characters
        System.out.println("|" + "\tPrateek\t".trim() + "|");
        //.strip() removes all leading and all trailing whitespaces. strip() is an improvement on .trim()
        System.out.println("|" + "\tPrateek\t".strip() + "|");

        //.split() splits the string at the provided argument character and returns an array of strings
        System.out.println(Arrays.toString("I am Batman".split(" ")));

    }


}
