package Concepts.DataStructures.LargeStrings;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* StringBuffer is
         - Mutable: You can modify the object without creating a new object unlike String making it more efficient than String. If we keep changing String values new objects are created after every change and they persist in String Pool taking extra memory. StringBuffer and StringBuilder can be used to avoid this
         - Thread-safe (synchronized) hence used in multi-threaded environments
        */

        /* StringBuilder is not thread-safe, and hence is faster than StringBuffer
        - If you're working with multiple threads use StringBuffer, else use StringBuilder
         */

//        CONSTRUCTOR NO 1
        StringBuffer buffer = new StringBuffer();
        //The default initial capacity of StringBuffer is 16
        System.out.println(buffer.capacity());

        /* Converted to String like this-
        String str = buffer.toString();
        System.out.println(str);
         */

        //Appending to the String without creating a new object
        buffer.append("Daredevil");
        buffer.append("cool");

        System.out.println(buffer);

        //Inserts a string at specified position
        buffer.insert(9, " is ");
        System.out.println(buffer);

        //Replace the specified part of the String with some other String. The start index is inclusive, end index is exclusive
        buffer.replace(0,9, "Spiderman");
        System.out.println(buffer);

        //Delete a part of String
        buffer.delete(0,9);
        System.out.println(buffer);
        System.out.println(buffer.capacity());

//        CONSTRUCTOR NO 2
        StringBuffer secondBuffer = new StringBuffer("Daredevil initialized");
        String second = secondBuffer.toString();
        System.out.println(second);

//        CONSTRUCTOR NO 3
        //In this constructor you can specify the initial capacity of the StringBuffer. The default capacity value is 16 characters. As we keep appending it grows like in ArrayList
        StringBuffer thirdBuffer = new StringBuffer(30);
        System.out.println(thirdBuffer.capacity());

//        GENERATING RANDOM STRING USING STRINGBUFFER
        System.out.println(RandomString.generateString(20));

//        REMOVING WHITESPACES
        String sentence = "I am a death sentence";
        System.out.println(sentence);

        String result = sentence.replaceAll("\\s", "");
        System.out.println(result);

//        SPLIT A STRING
        String names = "Me, My friend, Steve";
        String[] arr = names.split(",");
        System.out.println(Arrays.toString(arr));

//        ROUNDING OFF
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
        System.out.println(df.format(99.29));
    }
}
