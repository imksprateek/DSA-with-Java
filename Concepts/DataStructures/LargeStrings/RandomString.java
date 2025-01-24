package Concepts.DataStructures.LargeStrings;

import java.util.Random;

public class RandomString {
    static String generateString(int size){
        StringBuffer result = new StringBuffer();
        Random random = new Random();

        for(int i=0; i<size; i++){
            result.append((char)random.nextInt(97,122));
        }

        return result.toString();
    }
}
