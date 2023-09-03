public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0; // Count of elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i]; // Shift non-equal elements to the beginning
                count++;
            }
        }
        
        return count;
    }
public static void main(String[] args) {
    int[] nums = {3, 2, 2, 3};
int val = 3;
System.out.println(removeElement(nums,val));
}    
}
