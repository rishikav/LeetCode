// 3Sum

// Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

// Given array nums = [-1, 0, 1, 2, -1, -4],

// A solution set is:
// [
//   [-1, 0, 1],
//   [-1, -1, 2]
// ]

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                } else if (sum > 0) {
                 k--;
                } else {
                 j++;
                }
            }
            
        }
        return new ArrayList(set);
    }
}