package Concepts.Algorithms.Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        String word = "Eat 5 star do nothing";
        char target = 'a';
        search(word, target);
    }

    static void search(String word, char target) {
        for (int i = 0; i < word.length(); ++i) {
            if (word.trim().charAt(i) == target) {
                System.out.println("Character found at index: " + i);
            }
        }
    }
}
