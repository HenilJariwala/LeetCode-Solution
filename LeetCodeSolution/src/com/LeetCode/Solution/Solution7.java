// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21

package com.LeetCode.Solution;

public class Solution7 {
    public int reverse(int x) {
        
        int rem;
        long sum=0;
        while(x!=0){
            rem= x%10;
            sum=(long)sum*10+rem;
            x=x/10;
        }
        if(sum >= -2147483648 && sum<=2147483647){
            return (int)sum;
        }
        else{
            return 0;
        }
    }

    public static void main(String args[]) {
		Solution7 ob1= new Solution7();
		int ans = ob1.reverse(-123);
		System.out.println(ans);
	}
}
