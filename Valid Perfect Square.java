 // Valid Perfect Square


 // Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.


class Solution {
    public boolean isPerfectSquare(int num) {
      if(num<0)
            return false;
        long sqrt = num;
        while(sqrt*sqrt > num){
            sqrt = (num/sqrt + sqrt)/2;
            System.out.println(sqrt);
            
        }
        return sqrt*sqrt == num;
    }
}

