// Longest Substring with At Least K Repeating Characters

// Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.

// Input:
// s = "ababbc", k = 2

// Output:
// 5

// The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.

class Solution {
    public int longestSubstring(String s, int k) {
        int count[] = new int[26];
        int max = 0, start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'a']++;
            
            if(count[s.charAt(end)-'a'] >= k) {
                while (end - start + 1 >= k) {
                    if (isValid(count,k)) {
                        max = Math.max(max, end - start + 1);
                        break;
                    }
                    count[s.charAt(start) - 'a']--;
                    start++;
                }
                for (int i = 0; i < start; i++) {
                    count[s.charAt(i) - 'a']++;
                }
                start = 0;
            }
        }
        return max;
    }
    
    public boolean isValid(int count[], int k) {
        for (int i = 0; i<26; i++) {
            if(count[i] < k && count[i]!=0) {
                return false;
            }
        }
        return true;
    }
}