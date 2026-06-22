package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	  public static int[] twoSum(int[] nums, int target) {
		  HashMap<Integer,Integer>map=new HashMap<>();
		  for(int i=0;i<nums.length;i++) {
			  int need=target-nums[i];
			  if(map.containsKey(need)) {
				  return new int[] {map.get(need),1};
			  }
			  map.put(nums[i], i);
		  }
		  System.out.println("map : "+map);
		  
//            for(int i=0;i<nums.length;i++) {
//            	for(int j=1;j<nums.length;j++) {
//            		if(nums[i]+nums[j]==target) {
//            			System.out.println(" i : "+i+" j : "+j);
//            			return null;
//            		}
//            	}
//            }
	        return new int[]{};
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {2, 7, 11, 15};
	        System.out.println(Arrays.toString(twoSum(nums1, 9))); // [0, 1]

	        int[] nums2 = {3, 2, 4};
	        System.out.println(Arrays.toString(twoSum(nums2, 6))); // [1, 2]

	        int[] nums3 = {3, 3};
	        System.out.println(Arrays.toString(twoSum(nums3, 6))); // [0, 1]
	    }

}
