public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters until a space is encountered or the beginning of the string is reached
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + lengthOfLastWord(s1)); // Output should be 5

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + lengthOfLastWord(s2)); // Output should be 4
    }
}
