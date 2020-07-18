// Single Number II

// Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

// Input: [2,2,3,2]
// Output: 3

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i =0; i<nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i],hm.get(nums[i])+1);
                
            } else {
                hm.put(nums[i],1);
            }
        }
        for (int i : hm.keySet()) {
            if (hm.get(i) == 1)
                return i;
        }
        return 0;
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i =0; i<nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i],hm.get(nums[i])+1);
                hs.remove(nums[i]);
                
            } else {
                hm.put(nums[i],1);
                hs.add(nums[i]);
            }
        }
        
        return hs.iterator().next();
    }
}