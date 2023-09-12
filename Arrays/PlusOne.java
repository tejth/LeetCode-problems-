public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, simply increment it and return
                digits[i]++;
                return digits;
            } else {
                // If the current digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }
        }

        // If we reach here, it means there's a carry from the most significant digit
        // We need to create a new array with an extra digit (1) at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9};
        int[] result = plusOne(digits);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
