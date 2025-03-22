//Leetcode 75
// 1071. Greatest Common Divisor of Strings

// For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.


// Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
// Example 3:

// Input: str1 = "LEET", str2 = "CODE"
// Output: ""
 
package com.LeetCode.Solution;

class Solution1071 {
    public boolean check1(String str1, String str) {
        int count = str1.length() / str.length();
        String res = "";
        for (int i = 0; i < count; i++) {
            res = res + str;
        }

        return (res.equals(str1));
    }

    public boolean check2(String str1, String str) {
        int count = str1.length() / str.length();
        String res = "";
        for (int i = 0; i < count; i++) {
            res = res + str;
        }

        return (res.equals(str1));
    }

    public String gcdOfStrings(String str1, String str2) {
        String ans = "";

        for (int i = str2.length(); i >= 1; i--) {
            String check = str2.substring(0, i);
            if (check1(str1, check) && check2(str2,check)) {
                ans = check;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1071 solution = new Solution1071();
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        String result = solution.gcdOfStrings(str1, str2);
        System.out.println("GCD of Strings: " + result); // Output should be "ABC"
    }
}
