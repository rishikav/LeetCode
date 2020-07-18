//  Isomorphic Strings

// Given two strings s and t, determine if they are isomorphic.

// Two strings are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

// Input: s = "foo", t = "bar"
// Output: false

// Input: s = "paper", t = "title"
// Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapS = new HashMap<Character,Character>();
        HashMap<Character,Character> mapT = new HashMap<Character,Character>();
        
        for(int i=0; i<s.length(); i++){
            if (!mapS.containsKey(s.charAt(i)))  {
                mapS.put(s.charAt(i), t.charAt(i));
            } if (!mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), s.charAt(i));
            } if (s.charAt(i)!=mapT.get(t.charAt(i)) || (t.charAt(i)!=mapS.get(s.charAt(i))))
                return false;
        }
        return true;    
    }
}