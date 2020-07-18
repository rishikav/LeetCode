// Decode String
// Given an encoded string, return its decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

// Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

class Solution {
    public String decodeString(String s) {
        String subString = "";
        String finalString = "";
        String numb = "";
        Stack<Integer> numStack = new Stack<Integer>();
        Stack<Character> charStack = new Stack<Character>();
        for (int i = 0; i<s.length(); i ++) {
            
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    numb = numb + s.charAt(i);
                    i++;
                }
                i--;
                numStack.push(Integer.parseInt(numb));
                numb = "";
            } else if (s.charAt(i) != ']') {

                charStack.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                
                subString = "";
                while (charStack.peek() != '[') {
                    subString = charStack.pop() + subString ;
                }
                
                charStack.pop();
                int num = numStack.pop();
                for (int j = 0; j < num; j++) {
                    for (int k = 0; k < subString.length(); k++)
                        charStack.push(subString.charAt(k));
                }
            }
        }
        while (!charStack.isEmpty()) {
            finalString = charStack.pop() + finalString;
        }
        return finalString;
    }
}