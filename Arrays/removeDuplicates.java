public class removeDuplicates {
public static int removeDuplicatess(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }
    
    int uniqueCount = 1;
    
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[uniqueCount] = nums[i];
            uniqueCount++;
        }
    }
    
    return uniqueCount;
}


public static void main(String[] args) {
    int arr[]={3,2,2,1};
    removeDuplicatess(arr);
}
}
