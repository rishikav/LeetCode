//  Reverse Words in a String

// Given an input string, reverse the string word by word.

 

// Example 1:

// Input: "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: "  hello world!  "
// Output: "world! hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.


class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" +");
        
        StringBuffer sb = new StringBuffer();
        for (int i = str.length-1; i>=0; i--) {
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}