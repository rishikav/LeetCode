// Wiggle Sort II

// Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

// Input: nums = [1, 5, 1, 1, 6, 4]
// Output: One possible answer is [1, 4, 1, 5, 1, 6].

// Input: nums = [1, 3, 2, 2, 3, 1]
// Output: One possible answer is [2, 3, 1, 3, 1, 2].

class Solution {
    public void wiggleSort(int[] nums) {
        class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        
        int newNum[] = new int[nums.length];
        int j = 0;

        int k = (nums.length-1);

        for (int i = ((nums.length+1)/2)-1; i>=0; i--) {
            newNum[j] = nums[i];
            j++;
            if (k>=(nums.length+1)/2) {
                newNum[j] = nums[k];
                k--;
                j++;
            }
            
        }
        for (int l = 0; l<nums.length; l++){
            nums[l] = newNum[l];
        }
    }
}
    }
}