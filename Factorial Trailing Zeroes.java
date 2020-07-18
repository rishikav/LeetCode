// Factorial Trailing Zeroes

// Given an integer n, return the number of trailing zeroes in n!.

// Input: 5
// Output: 1
// Explanation: 5! = 120, one trailing zero.

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {

            count = count + n/5;
            n = n/5;
        }
        return count;
    }
}