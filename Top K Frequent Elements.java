// Top K Frequent Elements

// Given a non-empty array of integers, return the k most frequent elements.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> map.get(n1) - map.get(n2));

        for (int n: map.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }
        
        int[] finalArray = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            finalArray[i] = heap.poll();
        }
        return finalArray;
  }
}