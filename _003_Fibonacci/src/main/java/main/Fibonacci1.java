package main;

public class Fibonacci1 {
    public static void main(String[] args) {

        int N = 45;
        long prev1 = 0;
        long prev2 = 1;

        System.out.println("0. " + prev1);
        System.out.println("1. " + prev2);

        for (int i = 2; i <= N; i++) {
            long current = prev1 + prev2;
            System.out.println(i + ". " + current);
            prev1 = prev2;
            prev2 = current;
        }
    }
}

/**
 * * Write Java programs to list the first Fibonacci numbers! The IDE project should be named _03_Fibonacci.
 * *
 * * In mathematics, the Fibonacci numbers form an infinite sequence, in which each number is the sum of the previous
 * two.
 * * The initial elements of the sequence (with indices 0 and 1) are 0 and 1, respectively. The first few numbers are
 * shown in the table below.
 * *
 * * The programs should print the first N numbers to the standard output. Print a single Fibonacci number per line,
 * * along with its index, more precisely in the following format (note the spaces):
 * * 7. 13
 * *
 * * Subtask 1
 * * Let N=45, and do not use arrays in the program! The class should be named Fibonacci.
 * *
 * * Subtask 2
 * * Let N=45, and base the program on using an array: first fill the array with the Fibonacci numbers,
 * * then print them out (in a separate loop)! The name of the class should be FibonacciArray.
 * *
 * * Subtask 3 (optional)
 * * Think about why the task writer decided to let the programs run up to N=45! What would happen
 * * if they went a little further than that; what would go wrong then? How could we improve our programs so that
 * * they work well up to higher indices, e.g. 80? Answer in one or two complete sentences!
 */
