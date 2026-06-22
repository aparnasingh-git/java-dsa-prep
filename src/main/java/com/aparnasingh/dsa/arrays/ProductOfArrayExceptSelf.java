package arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] result = new int[nums.length];

		// result[i] stores the product of all elements BEFORE index i
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		System.out.println("Result : " + Arrays.toString(result));
		/*
		 * rightProduct keeps track of product of elements after index i
		 * 
		 * Multiply prefix (result[i]) × suffix (rightProduct)
		 */
		int rightProduct = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * rightProduct;
			rightProduct *= nums[i];
		}
		System.out.println("ans : " + Arrays.toString(result));
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(productExceptSelf(nums1)));
		// [24, 12, 8, 6]

		int[] nums2 = { -1, 1, 0, -3, 3 };
		System.out.println(Arrays.toString(productExceptSelf(nums2)));
		// [0, 0, 9, 0, 0]
	}
}