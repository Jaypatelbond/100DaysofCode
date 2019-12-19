/**
 * 
 * 7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: 
[−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * 
 * @author Jaypatelbond
 */

 class Solution {
    public int reverse(int x) {
        long reverse = 0;
        while (x != 0){
           reverse = reverse * 10 + x % 10;
            x = x / 10;  
        }
       
        if(reverse <Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
            return 0;
        }else{
            return (int)reverse;
        }
        
    }
}