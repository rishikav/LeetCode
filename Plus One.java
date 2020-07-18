// Plus One

// Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

// Input: [1,2,3]
// Output: [1,2,4]

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i]+carry == 10) {
                digits[i] = 0;
                carry = 1;

            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
            }
        }
        
        if (carry == 1) {
            int newDigits[] = new int[digits.length+1];
            int k = 0;
            newDigits[k] = 1;
            for (int i : digits){
                newDigits[k+1] = i;
                k++;
            }
            return newDigits;
        }
        return digits;
    }
}