// Single Number

// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

// Note:

// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// Input: [4,1,2,1,2]
// Output: 4


class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-1;) {
            if (nums[i]==nums[i+1]){
                i = i + 2;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}