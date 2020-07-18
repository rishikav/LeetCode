// Add Digits

// Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

// Input: 38
// Output: 2 
// Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
//              Since 2 has only one digit, return it.

class Solution {
    public int addDigits(int num) {
        
        int count = num;
        while (num>=10) {
            count = 0;
            while (num>0) {
                count += num%10;
                num = num/10;
            }
            num = count;
            
        }
        
        return count;
    }
}