package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;

	    int i = 0; // points to last unique element

	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1);
        System.out.println(Arrays.toString(Arrays.copyOf(nums1, k1)));
        // Expected: [1, 2]

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2);
        System.out.println(Arrays.toString(Arrays.copyOf(nums2, k2)));
        // Expected: [0, 1, 2, 3, 4]
    }

}