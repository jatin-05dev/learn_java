public class StringBasics {

    public static void main(String[] args) {

        // 1. String creation
        String s1 = "Java";                 // String literal
        String s2 = new String("Java");     // new keyword

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // 2. == vs equals()
        System.out.println(s1 == s2);        // false (reference check)
        System.out.println(s1.equals(s2));   // true  (value check)

        // 3. String length
        String s3 = "Programming";
        System.out.println("Length: " + s3.length());

        // 4. charAt()
        System.out.println("Char at index 2: " + s3.charAt(2));

        // 5. toUpperCase & toLowerCase
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());

        // 6. substring()
        System.out.println("Substring: " + s3.substring(0, 4));

        // 7. contains()
        System.out.println(s3.contains("gram")); // true

        // 8. replace()
        String s4 = "Ja va";
        System.out.println(s4.replace(" ", ""));

        // 9. split()
        String s5 = "Java is very easy";
        String[] arr = s5.split(" ");
        for (String word : arr) {
            System.out.println(word);
        }

        // 10. String immutability
        String s6 = "Hello";
        s6.concat(" World");
        System.out.println(s6); // Hello (unchanged)

        // 11. String reverse
        String s7 = "Java";
        String rev = "";
        for (int i = s7.length() - 1; i >= 0; i--) {
            rev = rev + s7.charAt(i);
        }
        System.out.println("Reverse: " + rev);

        // 12. Palindrome check
        String s8 = "madam";
        String rev2 = "";
        for (int i = s8.length() - 1; i >= 0; i--) {
            rev2 = rev2 + s8.charAt(i);
        }

        if (s8.equals(rev2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // 13. StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);

        // 14. StringBuffer
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println(sf);
    }
}
