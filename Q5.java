/*Q5. Remove All Digits from a String: Remove all numeric characters from a string using replaceAll() with a regular expression to match digits (\d).
Hint: String str = "Hello123World456";
String result = str.replaceAll("\\d", ""); // Replace all digits (0-9) with an empty string */

public class Q5 {

    public static void main(String[] args) {
        String str = "Hello123World456";
        String result = str.replaceAll("\\d", "");
        System.out.println("Original string: " + str);
        System.out.println("String after removing digits: " + result);
    }
}
