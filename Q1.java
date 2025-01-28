/*Q1. Capitalize the First Letter of Each Word: Split the string into words, capitalize the first letter using substring(), and join them back. */

import java.util.function.Function;
import java.util.regex.Pattern;

public class Q1 {

    public static void main(String[] args) {
        String myStr = "first letter is capital of every word of this sentence.";
        Function<String, String> capitalizeFirstLetter = (s)
                -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        String result = Pattern.compile("\\b(\\w+)")
                .matcher(myStr)
                .replaceAll(match -> capitalizeFirstLetter.apply(match.group()));
        System.out.println(result);
    }
}
