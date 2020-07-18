// Valid Anagram

// Given two strings s and t , write a function to determine if t is an anagram of s.

// Input: s = "anagram", t = "nagaram"
// Output: true

// Input: s = "rat", t = "car"
// Output: false

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mapS = new HashMap<Character,Integer>();
        for (int i =0; i<s.length(); i++) {
            if(!mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), 1);
            }  else {
                mapS.put(s.charAt(i), mapS.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i<t.length(); i++) {
            if(mapS.containsKey(t.charAt(i))) {
                mapS.put(t.charAt(i), mapS.get(t.charAt(i))-1);
            }
        }
        for (char c : mapS.keySet()) {
            if (mapS.get(c) != 0) 
                return false;
        }       
        return true;
    }
}