package hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
     	Map<Integer,Integer> hashMap = new HashMap<>();
        Set<Integer> resultSet = new HashSet<>();

        //count occurences of each number
	   	for(int i=0;i<nums1.length;i++) {
	   		hashMap.put(nums1[i], hashMap.getOrDefault(nums1[i], 0)+1);
	   	}
	   	
	    // Check intersection with nums2
	   	for(int num:nums2) {
	   		if(hashMap.containsKey(num)) {
	   			resultSet.add(num);
	   			hashMap.remove(num);
	   		}
	   	}
	    int[] result = new int[resultSet.size()];
	    int index = 0;
	    for (int num : resultSet) {
	        result[index++] = num;
	    }
	   	
    	return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        // Expected: [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));
        // Expected: [9, 4] or [4, 9]
    }
}
