//Arranging Coins

class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int count = 1;
        while ((n-i) >= 0) {
            count ++;
            i = i + count;
        }
        if (count == (n-i)) {
            return count;
        } else {
            return count-1;
        }
    }
}