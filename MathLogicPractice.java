import java.util.Scanner;

public class MathLogicPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to test: ");
        int num = sc.nextInt();

        System.out.println("\n--- Results for " + num + " ---");

        // 1. EVEN OR ODD
        // Logic: If remainder when divided by 2 is 0, it's even.
        if (num % 2 == 0) {
            System.out.println("-> " + num + " is Even.");
        } else {
            System.out.println("-> " + num + " is Odd.");
        }

        // 2. POSITIVE, NEGATIVE, OR ZERO
        if (num > 0) {
            System.out.println("-> It is a Positive number.");
        } else if (num < 0) {
            System.out.println("-> It is a Negative number.");
        } else {
            System.out.println("-> The number is Zero.");
        }

        // 3. PRIME NUMBER CHECK
        // Logic: A prime is only divisible by 1 and itself.
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("-> Is it Prime? " + (isPrime ? "Yes" : "No"));

        // 4. DIVISIBILITY RULE
        // Example: Check if divisible by both 5 and 11
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("-> Special: Divisible by both 5 and 11!");
        }

        sc.close();
    }
}