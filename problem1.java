import java.util.Arrays;
public class problem1 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;
        
        // Count the number of zeroes
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }
        
        // Move non-zero elements to the front
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // Append zeroes at the end
        while (zeroCount > 0) {
            nums[index] = 0;
            index++;
            zeroCount--;
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
        
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
