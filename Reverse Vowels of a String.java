// 


class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length()-1;
        HashSet<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] ch = s.toCharArray();
        char temp = ' ';
        while (i < j) {
            if (set.contains(ch[i]) && set.contains(ch[j])) {
                //first = i;
                //last = j;
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++; j--;
            } else if(set.contains(ch[i]) && !set.contains(ch[j])) {
                j--;
            } else if(!set.contains(ch[i]) && set.contains(ch[j])){
                i++;
            } else {
                i++; j--;
            }
        }
        return String.valueOf(ch);                
    }
}