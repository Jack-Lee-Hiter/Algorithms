package leetCode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class twoSum {
	public static int[] getTwoSum(int[] nums, int target)
	{
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(target - nums[i]))
			{
				res[1] = i;
				res[0] = map.get(target - nums[i]);
				return res;
			}
			map.put(nums[i], i);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 4};
		int target = 6;
		int[] res = getTwoSum(nums, target);
		System.out.println(res[0] + " "+ res[1]);
	}

}
