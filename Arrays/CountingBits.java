import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] result = countBits(n);
        
        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
// For i = 0, Integer.bitCount(0) calculates the count of 1's in the binary representation of 0, which is 0. So, ans[0] is set to 0.
// For i = 1, Integer.bitCount(1) calculates the count of 1's in the binary representation of 1, which is 1. So, ans[1] is set to 1.
// For i = 2, Integer.bitCount(2) calculates the count of 1's in the binary representation of 2, which is 1. So, ans[2] is set to 1.
// For i = 3, Integer.bitCount(3) calculates the count of 1's in the binary representation of 3, which is 2. So, ans[3] is set to 2.