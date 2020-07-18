//  Roman to Integer

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int count = 0;
        for (int i = 0; i<s.length()-1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                count -= map.get(s.charAt(i));

            } else {
                count += map.get(s.charAt(i));
            }
        }
        count += map.get(s.charAt(s.length()-1));
        return count;
    }
}