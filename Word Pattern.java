// Word Pattern

// Given a pattern and a string str, find if str follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:

// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true
// Example 2:

// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String arr[] = str.split(" ");
        HashMap map = new HashMap();
        if (pattern.length() != arr.length) {

            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s = arr[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(s)){
                    return false;
                }
            } else {
                if (map.containsValue(s)) {
                    return false;
                } else {
                    map.put(c, s);
                }
            }
        }
        return true;
    }
}