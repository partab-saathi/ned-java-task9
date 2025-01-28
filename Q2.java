/*Q2. Find Index of a Character: Find the first and last occurrence of a character using indexOf() and lastIndexOf(). */
public class Q2 {

    public static void main(String[] args) {
        String input = "hello java";
        char Char = 'o';
        int firstIndex = input.indexOf(Char);
        int lastIndex = input.lastIndexOf(Char);
        System.out.println("First occurrence of '" + Char + "': " + firstIndex);
        System.out.println("Last occurrence of '" + Char + "': " + lastIndex);
    }
}
