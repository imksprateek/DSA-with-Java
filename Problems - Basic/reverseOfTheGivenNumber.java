public class reverseOfTheGivenNumber {
    public static void main(String[] args) {
        int num = 45239637;
        int digit, reversed_num = 0, factor = 10;
        while (num != 0) {
            digit = num % 10;
            reversed_num = reversed_num * factor + digit;
            num /= 10;
            System.out.println(reversed_num);
        }
    }
}
