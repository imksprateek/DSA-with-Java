package Concepts.HandlingLargeNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        BigIntegerFun();
        BigDecimalFun();

    }

    static void BigIntegerFun(){
        int a = 37;
        int b = 67;

        //Converting int to BigInteger
        BigInteger A = BigInteger.valueOf(a);
        BigInteger B = BigInteger.valueOf(433633632);
        BigInteger C = BigInteger.valueOf(Long.parseLong("3633632"));

        System.out.println("A: " + A + " B: " + B + " C: " + C);

        BigInteger F = new BigInteger("4289923875298209423483");
        BigInteger G = new BigInteger("3243243289923875298209483");
        System.out.println("F: " + F);

        //Constants
        BigInteger D = BigInteger.TEN;
        System.out.println("D: " + D);

        //Addition
        BigInteger E = F.add(G);
        System.out.println("E: " + E);

        //multiplication
        BigInteger H = E.multiply(F);
        System.out.println("H: " + H);

        //subtraction
        System.out.println("H-E = " + H.subtract(E));
        //division
        System.out.println("H/E = " + H.divide(E));
        //remainder
        System.out.println("H%E = " + H.remainder(E));

        //Converting BigInteger to int value
        int c = A.intValue();
        System.out.println("BigInteger A converted to int: " + c);

        //Comparison
        if(E.compareTo(H) < 0){
            System.out.println(E.compareTo(H));
            System.out.println("YES, E<H");
        }

        System.out.println(Factorial.findFactorial(52));
    }

    static void BigDecimalFun(){
        double x = 0.03;
        double y = 0.04;
        double ans = x-y;
        System.out.println(ans);
        //Note that the ans value is 0.010000000000000002, which is not completely accurate
        /*
        This is because float and double are floating point numbers that are binary representation  of a fraction and an exponent.
        Hence they can give a very small margin of error.

        But BigDecimal gives the exact answer without any error
         */
        //Ranger of BigDecimal: contains a random precision int unscaled value & 32 bit integer scale
        //If >=0 then scale = no of digits on the right of decimal point. Else unscale value = 10^(-scale)

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ANS = X.subtract(Y);
        System.out.println(ANS);

        //Operations
        BigDecimal a = new BigDecimal("432723.423948239890824203982098423");
        BigDecimal b = new BigDecimal("1084323.90823848832750982533242424234234");
        System.out.println("a+b = " + a.add(b));
        System.out.println("a-b = " + a.subtract(b));
        System.out.println("a*b = " + a.multiply(b));
        System.out.println("a/b = " + b.divide(a, new MathContext(15)));
        System.out.println("a%b = " + a.remainder(b));
        System.out.println("a^2 = " + a.pow(2));
        System.out.println("-a = " + a.negate(new MathContext(12)));

        //Constants
        BigDecimal con = BigDecimal.ONE;
        System.out.println(con);
    }
}
