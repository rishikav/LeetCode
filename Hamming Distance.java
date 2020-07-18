// Hamming Distance

// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Given two integers x and y, calculate the Hamming distance.

// Input: x = 1, y = 4

// Output: 2

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x/2 >= 0 || y/2 >= 0) {
            if (x%2 != y%2) {
                count++;
            }
            if (x/2 == 0 && y/2 == 0)
                break;
            x = x/2;
            y = y/2;
        }
        return count;
    }
}