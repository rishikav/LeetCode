// Sort Colors

// Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

// Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

// Note: You are not suppose to use the library's sort function for this problem.

// Example:

// Input: [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

class Solution {
    public void sortColors(int[] nums) {
        Stack<Integer> Ones = new Stack<Integer>();
        Stack<Integer> Twos = new Stack<Integer>();
        int j = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i]  == 0) {
                nums[j] = 0;
                j++;
            } else if (nums[i] == 1) {
                Ones.push(nums[i]);
            } else {
                Twos.push(nums[i]);
            }
        }
        while (!Ones.isEmpty()) {
            nums[j] = Ones.pop();
            j++;
        }
        while (!Twos.isEmpty()) {
            nums[j] = Twos.pop();
            j++;
        }
    }
}