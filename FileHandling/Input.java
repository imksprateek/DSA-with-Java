package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //        *INPUT*

        //We use Stream to handle files in Java. Stream can be of 2 types: Byte stream and Character stream
        //For creating a scanner object, we use System.in which is of type InputStream
        Scanner scanner = new Scanner(System.in);

        /*
        - Byte Stream: Used to handle Input and Output of Binary data
        Byte stream is divided into 2 class hierarchies: Input stream and Output stream

        - Character Stream:
        Character stream is divided into 2 parts: Reader and Writer

        Input stream, Output stream, Reader and Writer are abstract classes. They have read or write methods for which we have to write our implementation.
        * Any class that ends with Stream is for byte data and any class that ends with Reader or Writer is for character data.
        Eg: PipedInputStream, SequenceInputStream, StringBufferInputStream, OutputStreamWriter, PipedWriter, BufferedReader, CharArrayReader
         */

        //IO Exception: Corrupt file, File not able to read, file not found

        /*
        PREDEFINED STREAMS in Java:
        - System.out: std output stream -> console  (PrintStream type)
        - System.in: std input stream -> keyboard   (InputStream type)
        - System.err: std error -> console          (PrintStream type)
        since all these are ending with Stream they are all ByteStream's
         */

        //InputStreamReader is a bridge from byte streams to character streams, used for conversion

        //Any class that implements AutoCloseable interface can be considered as a resource. Hence it is important to close it once we are done using it

        //In the following example, we are taking input in byte stream (System.in) and putting it out in character stream (char)
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter some letters: ");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
////            isr.close(); is not necessary here since try catch block will automatically close it. This has been introduced since Java 7
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        try(FileReader fr = new FileReader("src/FileHandling/notes.txt")){
            System.out.println("Enter some letters: ");
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
//            isr.close(); is not necessary here since try catch block will automatically close it. This has been introduced since Java 7
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        //BufferedReader takes Byte stream in the constructor.
        // But for taking input from keyboard we need System.in which is character stream.
        // So we have converted character stream byte stream using InputStreamReader
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            System.out.println("You typed: " + br.readLine());
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        //If in interviews, test cases are given in a file and you need to read them use the below method
        try(BufferedReader br = new BufferedReader(new FileReader("src/FileHandling/notes.txt"))){
            while (br.ready()){
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
