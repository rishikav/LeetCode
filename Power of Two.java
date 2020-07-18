// Power of Two

// Given an integer, write a function to determine if it is a power of two.

// Input: 16
// Output: true
// Explanation: 24 = 16

// Input: 218
// Output: false

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1 || n==2)
            return true;
        if (n%2==1)
            return false;
        
        int i = 1;
        while ((int)Math.pow(2,i) <n) {

            i++;
            
        }
        if ((int)Math.pow(2,i) ==n)
            return true;
        return false;
    }
}