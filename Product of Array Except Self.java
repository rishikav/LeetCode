// Product of Array Except Self

// Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// Example:

// Input:  [1,2,3,4]
// Output: [24,12,8,6]
// Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

// Note: Please solve it without division and in O(n).



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product[] = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0] = 1; right[nums.length-1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        for (int i = nums.length - 2; i >=0; i--) {
            right[i] = nums[i+1] * right[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            product[i] = left[i] * right[i];
        }
        return product;
    }
}


class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = nums.length;
        int product[] = new int[len];
        for (int i = 0; i <len; i++) {
            map.put(i, nums[i]);
            
        }
        
        

        for (int i = 0; i < len; i++) {
            product[i] = 1;
            
            for (int j = (i+1+len)%len; j!=i; j = (j+1+len)%len) {
                //System.out.println("i "+i+"j "+j);
                product[i] *= map.get(j);
            }
            
        }
        return product;
    }
}