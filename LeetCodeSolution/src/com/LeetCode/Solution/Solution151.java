// Leetcode 75
// 151. Reverse Words in a String

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 
// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

package com.LeetCode.Solution;

import java.util.ArrayList;

class Solution151 {
    public String reverseWords(String s) {
        s = s.trim()+" ";
        ArrayList<String> str = new ArrayList<String>();
        int start = 0;
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                String str1 = s.substring(start, i);
                if (!(str1.isEmpty())){
                    result = str1.trim() + " " + result;
                }
                start = i + 1;
            }
        }
        return result.trim();
    }

        public static void main(String[] args) {
            Solution151 sol = new Solution151();
            String input = "  Bob    Loves  Alice   ";
            String result = sol.reverseWords(input);
            System.out.println("Original: " + input);
            System.out.println("After reversing vowels: " + result);
        }
}

