// Longest Increasing Subsequence

// Given an unsorted array of integers, find the length of longest increasing subsequence.

// Example:

// Input: [10,9,2,5,3,7,101,18]
// Output: 4 
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length==0)
            return 0;
        int count[] = new int[nums.length];
        count[0] = 1;
        int maxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            int val = 0;
            for (int j = 0; j <i; j++) {
                if (nums[i]>nums[j]) {
                    val = Math.max(val,count[j]);
                }
            }
            count[i] = val + 1;
            maxCount = Math.max(maxCount, count[i]);
        }
        return maxCount;
    }
}   