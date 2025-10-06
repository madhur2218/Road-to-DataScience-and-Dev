public class Main {

    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

        //Some practice problems on string builder

        System.out.println("---------String builder practice problems---------");

        // Create a StringBuilder and append your name and city.
        // Example: "My name is Madhur and I live in Bangalore."
        StringBuilder countryName =new StringBuilder();
        countryName.append("My name is Madhur");
        countryName.append("and I live in Bangalore.");
        System.out.println(countryName);
        System.out.println(countryName.getClass().getName());

        // Given: StringBuilder sb = new StringBuilder("I Java");
        // Task: Insert "love " after "I " so that it becomes "I love Java".

        StringBuilder loveJava = new StringBuilder("I Java!");
        loveJava.insert(1," love");
        System.out.println(loveJava);

        // Given: StringBuilder sb = new StringBuilder("I hate bugs");
        // Task: Replace "hate" with "love".
        StringBuilder loveHate = new StringBuilder("I hate bugs");
        loveHate.replace(2,6,"love");
        System.out.println(loveHate);

        // Given: StringBuilder sb = new StringBuilder("abcdefg");
        // Task: Remove characters from index 2 to 5.
        // Expected output: "abg"
        StringBuilder sb = new StringBuilder("abcdefg");
        sb.delete(2,6);
        System.out.println(sb);

        // Reverse a given string using StringBuilder.
        // Input: "hello"
        // Output: "olleh"
        StringBuilder reverse = new StringBuilder("hello");
        reverse.reverse();
        System.out.println(reverse);

        // Write a program to check if a string is a palindrome using StringBuilder.
        // Example: "madam" → true, "hello" → false
        StringBuilder s = new StringBuilder("madam");
        checkPalindrome(s);

        // Replace all vowels in a string with '*'
        // Input: "developer"
        // Output: "d*v*l*p*r"
        // (Hint: Use a loop and sb.setCharAt())
        StringBuilder vowel = new StringBuilder("DEVELOPER");
        countVowel(vowel);

        //Insert Character After Every Word
        // Input: "I am learning Java"
        // Output: "I# am# learning# Java#"

        StringBuilder sc = new StringBuilder("I am learning Java");
        insertCharacter(sc);

        //Delete Every Second Character
        // Input: "abcdef"
        // Output: "ace"
        // (Hint: Use a loop and deleteCharAt)

        StringBuilder delete = new StringBuilder("abcdef");
        deleteSecondCharacter(delete);

        //StringBuilder Capacity and Length
        // Create a new StringBuilder with "Madhur"
        // Print its length and capacity.
        // Append more text and observe how capacity changes.

        StringBuilder lengthCapacity = new StringBuilder("hello world");
        lengthCapacity.append("this is me !");
        lengthAndCapacity(lengthCapacity);

        //String compression
        StringBuilder compression = new StringBuilder();
        StringCompression(compression);



    }

    public static void checkPalindrome(StringBuilder sb) {
        // Make a copy of the original string
        String original = sb.toString();

        // Reverse the StringBuilder
        String reversed = new StringBuilder(sb).reverse().toString();

        // Compare the string contents
        if (original.equals(reversed)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
}

    public static void countVowel(StringBuilder sb){
        //StringBuilder s = new StringBuilder(sb);
        int vowelCount = 0;

        for(int i=0;i<sb.length();i++){
            char ch = Character.toLowerCase(sb.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
                sb.setCharAt(i,'@');
            }
        }

        System.out.println(vowelCount);
        System.out.println(sb);
    }

    public static void insertCharacter(StringBuilder sb){

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == ' ') {
                sb.insert(i, '#');
                i++; // move ahead because we just inserted '#'
            }
        }

        sb.append('#'); // add '#' after the last word
        System.out.println(sb);
    }

    public static void deleteSecondCharacter(StringBuilder sb){

        for(int i=1;i<sb.length();i++){
            sb.deleteCharAt(i);
        }
        System.out.println(sb.toString());
    }
    public static void lengthAndCapacity(StringBuilder sc){
        System.out.println(sc.length());
        System.out.println(sc.capacity());
    }

    public static void StringCompression(StringBuilder sc){
        String string = "aaabbccccd";
        int count=0;

        for(int i=0;i<string.length();i++){
            if(i+1<string.length()&&string.charAt(i)==string.charAt(i+1)){
                count++;
            }
            else {
                sc.append(string.charAt(i));
                sc.append(count);
                count=1;
            }
        }

        System.out.println(sc);
    }



    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
