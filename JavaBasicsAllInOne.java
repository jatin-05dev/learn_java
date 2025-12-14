import java.util.Scanner;


/*
Java Basics – Single File
Covers:
- Tokens
- Structure of Java Program
- Variables & Data Types
- Input / Output
*/


class JavaBasicsAllInOne {
public static void main(String[] args) {


// 1️⃣ TOKENS IN JAVA
// Keywords: int, double, if, class, public, static
// Identifiers: a, b, name
// Literals: 10, 5.5, 'A', "Java"
// Operators: +, -, *, /, =
// Separators: ; , { }


// 2️⃣ VARIABLES & DATA TYPES
int a = 10; // integer
double b = 5.5; // decimal
char c = 'A'; // character
boolean flag = true; // true/false
String name = "Java"; // text


// 3️⃣ OUTPUT
System.out.println("Value of a: " + a);
System.out.println("Value of b: " + b);
System.out.println("Character: " + c);
System.out.println("Boolean: " + flag);
System.out.println("String: " + name);


// 4️⃣ INPUT USING SCANNER
Scanner sc = new Scanner(System.in);


System.out.print("Enter an integer: ");
int x = sc.nextInt();


System.out.print("Enter a double: ");
double y = sc.nextDouble();


System.out.print("Enter your name: ");
sc.nextLine(); // buffer clear
String userName = sc.nextLine();


// 5️⃣ DISPLAY INPUT
System.out.println("You entered integer: " + x);
System.out.println("You entered double: " + y);
System.out.println("Your name is: " + userName);


sc.close();
}
}