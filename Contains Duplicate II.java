// Contains Duplicate II

// Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

// Input: nums = [1,2,3,1], k = 3
// Output: true

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i<nums.length; i++) {

            for (int j = i+1; j<=i+k && j<nums.length; j++) {

                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int diff = 0;
        for (int i = 0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if ( (i-map.get(nums[i])) <=k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}