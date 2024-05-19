public class no_Of_Occurances {
    public static void main(String[] args) {
        int n = 1385757879;
        int test_n = 1385757879;
        int no_of_digits = 0;
        int no_of_occurances = 0;
        while (test_n != 0) {
            int rem = test_n % 10;
            test_n = test_n / 10;
            if (rem == 7) {
                no_of_occurances += 1;
            }
            no_of_digits += 1;
        }
        System.out.println(no_of_digits);
        System.out.println(no_of_occurances);
    }
}
