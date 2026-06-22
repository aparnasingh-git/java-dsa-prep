package arrays;

public class MaximumSubArray {
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum, and return that sum. Input: nums
	 * = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has the largest
	 * sum = 6z
	 */
	public static void main(String[] args) {
		int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums1)); // 6

		int[] nums2 = { 1 };
		System.out.println(maxSubArray(nums2)); // 1

		int[] nums3 = { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(nums3)); // 23
	}

	private static int maxSubArray(int[] nums) {
		int currentSum = nums[0];
		int maxSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]); 
			maxSum = Math.max(maxSum, currentSum); //this is required as maxSum may end earlier
		}
		return maxSum;
	}

}
