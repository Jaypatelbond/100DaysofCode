/**
 * Given an array nums of n integers, are there elements a, b, c in nums
 *  such that a + b + c = 0? Find all unique triplets in the array
 *  which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 * 
 * @author Jaypatelbond
 * 
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        int arrSize = 0 ;
        if (arrSize > 3) {
            arrSize = nums.length-3;
        } else {
            arrSize = nums.length;
        }
        for (int i=0; i<arrSize; i++) {
            if (i ==0 || nums[i] > nums[i-1]) {
                int left = i+1;
                int right = nums.length-1;
                while (left < right) {
                    if (nums[i]+nums[left]+nums[right] == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    }
                    if (nums[i]+nums[left]+nums[right] < 0) {
                        int currentLeft = nums[left];
                        while (currentLeft == nums[left] && left < right) {
                            left++;
                        }
                    } else {
                        int currentRight = nums[right];
                        while (currentRight == nums[right] && left<right) {
                            right--;
                        }
                    }
                }
            }
            
        }
        return result;  
    }
}