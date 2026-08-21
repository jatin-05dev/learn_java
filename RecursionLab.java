public class RecursionLab {

    public static void main(String[] args) {
        System.out.println("--- Recursion Results ---");

        // 1. Factorial of 5 (5 * 4 * 3 * 2 * 1)
        System.out.println("Factorial of 5: " + factorial(5));

        // 2. Sum of numbers from 10 down to 1
        System.out.println("Sum of 1 to 10: " + sum(10));

        // 3. 10th number in Fibonacci sequence
        System.out.println("10th Fibonacci Number: " + fibonacci(10));

        // 4. Reverse a string
        System.out.println("Reverse 'Java': " + reverseString("Java"));
    }

    // Method: Factorial
    public static int factorial(int n) {
        if (n <= 1) return 1; // Base case
        return n * factorial(n - 1);
    }

    // Method: Summation
    public static int sum(int n) {
        if (n <= 0) return 0; // Base case
        return n + sum(n - 1);
    }

    // Method: Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method: String Reversal
    public static String reverseString(String str) {
        if (str.isEmpty()) return str; // Base case
        // Take the last character and add it to the result of reversing the rest
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

public class RecursionLab {

    public static void main(String[] args) {
        System.out.println("--- Recursion Results ---");

        // 1. Factorial of 5 (5 * 4 * 3 * 2 * 1)
        System.out.println("Factorial of 5: " + factorial(5));

        // 2. Sum of numbers from 10 down to 1
        System.out.println("Sum of 1 to 10: " + sum(10));

        // 3. 10th number in Fibonacci sequence
        System.out.println("10th Fibonacci Number: " + fibonacci(10));

        // 4. Reverse a string
        System.out.println("Reverse 'Java': " + reverseString("Java"));
    }

    // Method: Factorial
    public static int factorial(int n) {
        if (n <= 1) return 1; // Base case
        return n * factorial(n - 1);
    }

    // Method: Summation
    public static int sum(int n) {
        if (n <= 0) return 0; // Base case
        return n + sum(n - 1);
    }

    // Method: Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method: String Reversal
    public static String reverseString(String str) {
        if (str.isEmpty()) return str; // Base case
        // Take the last character and add it to the result of reversing the rest
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}