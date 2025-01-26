package FileHandling;

import java.io.*;

public class Output {
    public static void main(String[] args) throws IOException {
//        *OUTPUT*

        //OutputStreamWriter is a bridge from character stream to byte stream
        OutputStream os = System.out;
        os.write(97);
        os.write('b');
        System.out.println();

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write(97);
            osw.write('A');
            osw.write('\n');
            osw.write("\uD83D\uDC80");
            osw.write("I am stew pid".toCharArray());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("src/FileHandling/fw_notes.txt")){
            //To open the file in append mode do this:
            //FileWriter fw = new FileWriter("src/FileHandling/new_notes.txt", true);
            //Creates new file
            fw.write("Changes from FileWriter");
            //Appends line
            fw.append("\nAppended a new change");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/FileHandling/bw_notes.txt"))){
            bw.write("Notes from BufferedWriter");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
