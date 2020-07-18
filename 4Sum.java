//  4Sum

//  Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

// Note:

// The solution set must not contain duplicate quadruplets.

// Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

// A solution set is:
// [
//   [-1,  0, 0, 1],
//   [-2, -1, 1, 2],
//   [-2,  0, 0, 2]
// ]

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadList = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            
            
            for (int j = i+1; j < nums.length; j++) {
                
                for (int k = j+1; k < nums.length; k++) {
                    
                    for (int l = k+1; l < nums.length; l++) {
                        
                        if (nums[i]+nums[j]+nums[k]+nums[l] == target) {

                            List<Integer> quad = new ArrayList<Integer>();
                            quad.add(nums[i]);
                            quad.add(nums[j]);
                            quad.add(nums[k]);
                            quad.add(nums[l]);
                            Collections.sort(quad);
                            hs.add(quad);
                        }
                    }
                }
            }
        }
        //loop over hashset 
        for (List<Integer> l : hs) {
            quadList.add(l);
        }
        return quadList;
    }
}


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        List<List<Integer>> quadList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            
            
            for (int j = i+1; j < nums.length; j++) {
                
                int k = j+1;
                int l = nums.length-1;
                while (k<l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        hs.add(Arrays.asList(nums[i] , nums[j] , nums[k++] , nums[l--]));
                    } else if (sum>target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        //loop over hashset 
        for (List<Integer> l : hs) {
            quadList.add(l);
        }
        return quadList;
    }
}