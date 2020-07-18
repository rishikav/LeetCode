// Missing Number

// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

// Example 1:

// Input: [3,0,1]
// Output: 2
// Example 2:

// Input: [9,6,4,2,3,5,7,0,1]
// Output: 8


class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length; i++) {
            if (i!=nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i<nums.length; i++) {
            if(!set.contains(i))
                return i;
        }
        return nums.length;
    }
}