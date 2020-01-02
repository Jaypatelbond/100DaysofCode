/**
 * Given an array with n integers, your task is to check if it could 
 * become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

Example 1:
Input: [4,2,3]
Output: True
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
Example 2:
Input: [4,2,1]
Output: False
Explanation: You can't get a non-decreasing array by modify at most one element.
Note: The n belongs to [1, 10,000].
 * 
 * 
 * @author Jaypatelbond
 */

class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums==null || nums.length<1)
            return true;
        return checkPossibility(nums,0,nums.length,0);
    }
    
    public boolean checkPossibility(int [] nums, int start,int end, int count){
        for(int i=start+1;i<end;i++){
            if(nums[i]<nums[i-1]){
                count++;
                if(count>1)
                    return false;
                int left = nums[i-1];
                int right = nums[i];
                nums[i]=left;
                boolean flag =checkPossibility(nums,0,end,1);
                nums[i]=right;
                nums[i-1]=right;
                return (flag || checkPossibility(nums,0,end,1));
            }
        }
        return true;
    }
}