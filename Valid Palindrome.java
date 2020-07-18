// Valid Palindrome

// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// Note: For the purpose of this problem, we define empty string as valid palindrome.

// Input: "A man, a plan, a canal: Panama"
// Output: true

class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        s = removeExtraChar(s);
        System.out.println(s);
        if (s.isEmpty() || s.length()==1) {
            return true;
        }
        
        
        for (int i = 0; i<(s.length())/2; i++) {
            stack1.push(s.charAt(i));
                
        }
        
        for (int j = s.length()-1; j>=(s.length()+1)/2; j--) {
            stack2.push(s.charAt(j));
                
        }
        
        while (!stack1.isEmpty()) {
            if(stack1.pop()!=stack2.pop()) {
                return false;
            }
        }
        return true;
    }
    public String removeExtraChar(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<(s.length()); i++) {
            if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}