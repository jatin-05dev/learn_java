public class IterationLab {

    public static void main(String[] args) {
        System.out.println("--- Iterative (Loop) Results ---");

        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Sum of 1 to 10: " + sum(10));
        System.out.println("10th Fibonacci Number: " + fibonacci(10));
        System.out.println("Reverse 'Java': " + reverseString("Java"));
    }

    // 1. Factorial using a FOR loop
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 2. Summation using a FOR loop
    public static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    // 3. Fibonacci using a WHILE loop (More efficient than recursion)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        
        int first = 0, second = 1;
        int count = 2;
        while (count <= n) {
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
        return second;
    }

    // 4. String Reversal using a loop
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;


        public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}