package arrays;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		 int[] nums1 = {0, 1, 0, 3, 12};
	        moveZeroes(nums1);
	        System.out.println(Arrays.toString(nums1)); // [1, 3, 12, 0, 0]

	        int[] nums2 = {0, 0, 1};
	        moveZeroes(nums2);
	        System.out.println(Arrays.toString(nums2)); // [1, 0, 0]

	        int[] nums3 = {1, 2, 3};
	        moveZeroes(nums3);
	        System.out.println(Arrays.toString(nums3)); // [1, 2, 3]
	}

	private static int[] moveZeroes(int[] nums) {
		int[]newArray=new int[nums.length];
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				newArray[index++]=nums[i];
					
			}
		}
		System.out.println("newArray : "+Arrays.toString(newArray));
		return newArray;
	}
}
