/*Q3. Check if a String is Numeric: Use the matches() method with a regular expression like \d+ to verify if a string contains only numbers.
Hint: String str = "12345";
String regex = "\\d+"; // Regular expression to match only digits (0-9) */

public class Q3 {

    public static void main(String[] args) {
        String str = "12345";
        String regex = "\\d+";
        boolean isNumeric = str.matches(regex);
        if (isNumeric) {
            System.out.println("The string '" + str + "' contains only numbers.");
        } else {
            System.out.println("The string '" + str + "' does not contain only numbers.");
        }
    }
}
