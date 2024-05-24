package Problems.Strings;

public class ShuffleString_Leetcode1528 {
    public static void main(String[] args) {
        String given = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println("Shuffled in order: " + restoreString(given, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] shuffledArray = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            shuffledArray[indices[i]] = s.charAt(i);
        }

        return new String(shuffledArray);
    }
}
