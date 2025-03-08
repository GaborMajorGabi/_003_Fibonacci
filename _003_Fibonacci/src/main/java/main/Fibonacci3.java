package main;

import java.math.BigInteger;

public class Fibonacci3 {
    public static void main(String[] args) {

        int N = 80;
        BigInteger[] fibonacciNumbers = new BigInteger[N + 1];

        fibonacciNumbers[0] = BigInteger.ZERO;
        fibonacciNumbers[1] = BigInteger.ONE;

        for (int i = 2; i <= N; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i -1].add(fibonacciNumbers[i - 2]);
        }

        for (int i = 0; i <= N; i++) {
            System.out.println(i + ". " + fibonacciNumbers[i]);
        }
    }
}

/**
 *  * * Subtask 3 (optional)
 *  * * Think about why the task writer decided to let the programs run up to N=45! What would happen
 *  * * if they went a little further than that; what would go wrong then? How could we improve our programs so that
 *  * * they work well up to higher indices, e.g. 80? Answer in one or two complete sentences!
 */

/**
 * * The writer probably chose the limit of 45 because Fibonacci numbers grow very quickly,
 * * and the 46th Fibonacci number is already over 2 billion, which is close to the maximum value of the 32-bit int type
 * * (2_147_483_647). If our program were to go further, e.g. to 47, the int type would overflow and we would get
 * incorrect
 * * results.
 * * To solve this problem, we can use the long type, which can handle a larger range (its maximum value
 * * is 9_223_372_036_854_775_807). However, even the long type would overflow at the 93rd Fibonacci number.
 * If we need even higher
 * * indices, we can use the BigInteger class, which can handle arbitrarily large integers.
 * *
 * * For example, using BigInteger, our program can work up to 80 or even higher:
 */
