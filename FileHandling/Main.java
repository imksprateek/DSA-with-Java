package FileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Creating the file
        try{
            File fo = new File("src/FileHandling/new_file.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Writing to the file
        try{
            FileWriter fw = new FileWriter("src/FileHandling/new_file.txt");
            fw.write("ದಕ್ಷಿಣ ಭಾರತದ ದ್ರಾವಿಡ ಭಾಷೆಗಳಲ್ಲಿ ಒಂದಾದ ಕನ್ನಡವನ್ನು ವಿಶೇಷವಾಗಿ ಕರ್ನಾಟಕ ರಾಜ್ಯದಲ್ಲಿ ಬರೆಯಲು ಬಳಸಲಾಗುತ್ತದೆ.");
            fw.close();
            //Note that FileWriter needs to be closed here if we are not appending anything after writing to the file. Otherwise changes won't reflect in the file
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Reading from a file
        try(BufferedReader br = new BufferedReader(new FileReader("src/FileHandling/new_file.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Delete the file
        try{
            File fo = new File("src/FileHandling/new_file.txt");
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
