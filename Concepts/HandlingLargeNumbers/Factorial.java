package Concepts.HandlingLargeNumbers;

import java.math.BigInteger;

public class Factorial {
    static BigInteger findFactorial(int num){
        BigInteger result = new BigInteger("1");

        for(int i=num; i>1; i--){
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
