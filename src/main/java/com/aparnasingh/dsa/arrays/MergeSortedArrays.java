package arrays;
import java.util.Arrays;
public class MergeSortedArrays {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i=(m-1),j=(n-1),k=m+n-1;
	        while(i>=0 && j>=0) {
	        	System.out.println("i : "+i+" j : "+j+" k : "+k);
	        	if(nums1[i]>nums2[j]) {
	        		nums1[k]=nums1[i];
	        		i--;
	        	} else {
	                nums1[k] = nums2[j];
	                j--;
	            }
	        	k--;
	        }
	        System.out.println("nums1 : "+Arrays.toString(nums1));
	        while(j>=0) {
	        	nums1[k]=nums2[j];
	        	j--;
	        	k--;
	        }
	        System.out.println("nums1 : final : "+Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
		int[] nums3 = { 0 };
		int[] nums4 = { 1 };
		merge(nums3, 0, nums4, 1);
	}
}
