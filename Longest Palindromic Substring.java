// Longest Palindromic Substring

// Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

// Example 1:

// Input: "babad"
// Output: "bab"
// Note: "aba" is also a valid answer.
// Example 2:

// Input: "cbbd"
// Output: "bb"

class Solution {
    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return s;
        }
        
        int len = s.length();
        boolean pal[][] = new boolean[len][len];
        int max = 0;
        String str = s.substring(0,1);
        for (int i = 0; i<len-1; i++) {
            pal[i][i] = true;
            pal[i][i+1] = s.charAt(i)==s.charAt(i+1);
        }
        pal[len-1][len-1] = true;
        
        for (int i = 0; i<len; i++) {
            
            for (int j = 0; j <i; j++) {
                
                pal[i][j] = pal[i-1][j+1] && s.charAt(i)==s.charAt(j);
                //System.out.println ("i "+i+"j "+j+"pal "+pal[i][j]);
                if (pal[i][j] && i-j+1 > max) {
                    max = i-j+1;
                    str = s.substring(j, i+1);
                    //System.out.println("max "+max+"str "+str);
                }
            }
        }
        return str;
    }
}