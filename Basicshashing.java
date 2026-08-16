// import java.util.*;
// class Basicshashing{
//    public static void main(String args[]){
       
//         Scanner sc=new Scanner(System.in);
//   // Step 1: Array size input
//         System.out.print("Enter size of array: ");
//         int num = sc.nextInt();
//         int arr[] = new int[num];

//         // Step 2: Array input
//         System.out.println("Enter " + num + " elements:");
//         for (int i = 0; i < num; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Step 3: Precompute frequency hash
//         int hash[] = new int[10000000000000000000];   // 0 se 12 tak ke numbers
//         for (int i = 0; i < num; i++) {
//             hash[arr[i]]++;
//         }


//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }


//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }





//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }



//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }



//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }




//         // Step 5: Queries
//         System.out.print("\nEnter number of queries: ");
//         int q = sc.nextInt();

//         System.out.println("Enter " + q + " query numbers:");
//         while (q-- > 0) {
//             int x = sc.nextInt();
//             System.out.println("Query: " + x + " → Count = " + hash[x]);
//         }

//         sc.close();
//     }
// }

//character hashing 

import java.util.*;

class  Basicshashing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input string
        System.out.print("Enter a string (lowercase): ");
        String s = sc.next();

        // hashing array for 26 alphabets
        int hash[] = new int[26];

        // precompute frequencies
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // query
        System.out.print("Enter character to check frequency: ");
        char c = sc.next().charAt(0);

        // fetch result
        System.out.println("Frequency of " + c + " is: " + hash[c - 'a']);
    }
}








// import java.util.*;
// class Basicshashing{
//    public static void main(String args[]){
       
//         Scanner sc=new Scanner(System.in);
//   // Step 1: Array size input
//         System.out.print("Enter size of array: ");
//         int num = sc.nextInt();
//         int arr[] = new int[num];

//         // Step 2: Array input
//         System.out.println("Enter " + num + " elements:");
//         for (int i = 0; i < num; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Step 3: Precompute frequency hash
//         int hash[] = new int[10000000000000000000];   // 0 se 12 tak ke numbers
//         for (int i = 0; i < num; i++) {
//             hash[arr[i]]++;
//         }


//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }


//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }





//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }



//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }



//         // Step 4: Show hash info
//         System.out.println("\n--- Frequency Table (Hash) ---");
//         for (int i = 0; i < hash.length; i++) {
//             if (hash[i] > 0) {
//                 System.out.println("Number " + i + " appears " + hash[i] + " times");
//             }
//         }




//         // Step 5: Queries
//         System.out.print("\nEnter number of queries: ");
//         int q = sc.nextInt();

//         System.out.println("Enter " + q + " query numbers:");
//         while (q-- > 0) {
//             int x = sc.nextInt();
//             System.out.println("Query: " + x + " → Count = " + hash[x]);
//         }

//         sc.close();
//     }
// }

//character hashing 

import java.util.*;

class  Basicshashing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input string
        System.out.print("Enter a string (lowercase): ");
        String s = sc.next();

        // hashing array for 26 alphabets
        int hash[] = new int[26];

        // precompute frequencies
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // query
        System.out.print("Enter character to check frequency: ");
        char c = sc.next().charAt(0);

        // fetch result
        System.out.println("Frequency of " + c + " is: " + hash[c - 'a']);
    }
}





