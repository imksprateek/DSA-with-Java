import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random_num = 234_000_000;
        float random_float = input.nextFloat();
        System.out.println(random_num);
        System.out.println(random_float);
        System.out.print("Enter a number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
    }
}
