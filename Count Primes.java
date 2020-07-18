// Count Primes

// Count the number of prime numbers less than a non-negative number, n.

// Input: 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n];
        int count = 0;
        for (int i = 2; i <n; i++) {
            if (prime[i])
                continue;
            count++;
            if (!prime[i]) {
                for (int j = 2; i*j < n; j++) {
                    prime[i*j] = true;
                }
            }
        }
        return count;
    }
}