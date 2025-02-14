// 28. Find the Index of the First Occurrence in a String

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

package com.LeetCode.Solution;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        int pos = -1;
        for (int i = 0; i <= haystack.length() - len; i++) {
            String str = haystack.substring(i, i + len);
            if (str.equals(needle)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String args[]) {
		Solution28 ob1= new Solution28();
		int ans = ob1.strStr("sadbutsad", "sad");
		System.out.println(ans);
	}
}
