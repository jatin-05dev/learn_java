/*
Java Loops – Single File
Covers:
- for loop
- while loop
- do-while loop
- break & continue
*/


class JavaLoopsAllInOne {
public static void main(String[] args) {


// 1️⃣ FOR LOOP
// Jab iterations fixed ho
System.out.println("For Loop:");
for(int i = 1; i <= 5; i++) {
System.out.println(i);
}


// 2️⃣ WHILE LOOP
// Jab condition pe depend ho
System.out.println("\nWhile Loop:");
int j = 1;
while(j <= 5) {
System.out.println(j);
j++;
}


// 3️⃣ DO-WHILE LOOP
// Kam se kam ek baar execute hota hai
System.out.println("\nDo-While Loop:");
int k = 1;
do {
System.out.println(k);
k++;
} while(k <= 5);


// 4️⃣ BREAK STATEMENT
System.out.println("\nBreak Example:");
for(int x = 1; x <= 10; x++) {
if(x == 5) {
break; // loop stop
}
System.out.println(x);
}


// 5️⃣ CONTINUE STATEMENT
System.out.println("\nContinue Example:");
for(int y = 1; y <= 5; y++) {
if(y == 3) {
continue; // skip
}
System.out.println(y);
}
}
}