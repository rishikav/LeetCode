//  Excel Sheet Column Number

// Input: "ZY"
// Output: 701

// Input: "AB"
// Output: 28


class Solution {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int k = 1;
        for (char c = 'A';c <='Z'; c++) {
            map.put(c,k);
            k++;
        }

            int count = 0;
            int l = 0 ;
            for (int i = s.length()-1; i>=0; i--) {
                count += (int)(Math.pow(26,l)) * map.get(s.charAt(i));
                l++;
            }
            return count;
    }
}