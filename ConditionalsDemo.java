public class ConditionalsDemo {
    public static void main(String[] args) {
        
        int score = 85;
        boolean hasLicense = true;
        int age = 20;

        // 1. Simple if
        System.out.println("--- Simple if ---");
        if (score > 50) {
            System.out.println("You passed!");
        }

        // 2. if-else
        System.out.println("\n--- if-else ---");
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("Too young to vote.");
        }

        // 3. if-else if ladder (Multiple conditions)
        System.out.println("\n--- if-else if ---");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or lower");
        }

        // 4. Nested if (if inside an if)
        System.out.println("\n--- Nested if ---");
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You are an adult and can drive.");
            } else {
                System.out.println("You are an adult but cannot drive.");
            }
        }

        // 5. The Ternary Operator (The "?" Question Mark)
        // Syntax: condition ? value_if_true : value_if_false
        System.out.println("\n--- Ternary Operator ---");
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("User status: " + status);

        // 6. Logical Operators (AND / OR)
        System.out.println("\n--- Logical Operators ---");
        if (age >= 18 && hasLicense) {
            System.out.println("Both conditions met: Ready for the road!");
        }
    }
}