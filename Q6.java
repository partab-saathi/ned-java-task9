/*Q6. Count the Number of Words in a String: Count the number of words in a string by splitting it using split() and checking the length of the resulting array.
Hint: // Split the string based on spaces and count the words
String[] words = str.split("\\s+"); // "\\s+" matches one or more spaces */

public class Q6 {

    public static void main(String[] args) {
        String str = "Count the number of words in this sentence.";
        String[] words = str.split("\\s+");
        int wordCount = words.length;
        System.out.println("The string is: \"" + str + "\"");
        System.out.println("Number of words: " + wordCount);
    }
}
