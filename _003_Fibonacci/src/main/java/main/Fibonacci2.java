package main;

public class Fibonacci2 {
    public static void main(String[] args) {

        int N = 45;
        long[] fibonacciNumbers = new long[N + 1];

        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i <= N; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        for (int i = 0; i <= N; i++) {
            System.out.println(i + ". " + fibonacciNumbers[i]);
        }
    }
}

/**
 *  * * Subtask 2
 *  * * Let N=45, and base the program on using an array: first fill the array with the Fibonacci numbers,
 *  * * then print them out (in a separate loop)! The name of the class should be FibonacciArray.
 */
