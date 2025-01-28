/*Q4. Check if a String Matches a Pattern: Use matches() to verify if a string matches a specific regular expression.
Hint: String str = "Hello123";
String regex = "[A-Za-z]+\\d+"; // Regular expression: letters followed by digits */

public class Q4 {

    public static void main(String[] args) {
        String str = "132Hello";
        String regex = "[A-Za-z]+\\d+";
        boolean matchesPattern = str.matches(regex);
        if (matchesPattern) {
            System.out.println("The string '" + str + "' matches the pattern.");
        } else {
            System.out.println("The string '" + str + "' does not match the pattern.");
        }
    }
}
