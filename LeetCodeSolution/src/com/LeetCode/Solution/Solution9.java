// 9. Palindrome Number
// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

package com.LeetCode.Solution;

public class Solution9 {
    public boolean isPalindrome(int x) {
       int rem, sum=0, temp=x;
       while(x>0){
        rem=x%10;
        sum=(sum*10)+rem;
        x=x/10;
       } 
       return (temp==sum);
    }

    public static void main(String args[]) {
		Solution9 ob1= new Solution9();
		boolean ans = ob1.isPalindrome(-121);
		System.out.println(ans);
	}
}
