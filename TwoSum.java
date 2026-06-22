
import java.util.HashMap;
import java.util.Map;

/*
Problem:
Given an integer array and a target value, find two numbers whose sum is equal to the target.

Approach:
Use HashMap to store each number and its index.
For every element, calculate target - current element.
If that value already exists in the map, return both indexes.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int requiredNumber = target - nums[i];

            if (map.containsKey(requiredNumber)) {
                return new int[]{map.get(requiredNumber), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indexes are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
