//Leetcode 75
// 345. Reverse Vowels of a String

// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"


package com.LeetCode.Solution;

class Solution345 {

    boolean checkvowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' ||a == 'E' || a == 'I' || a == 'O' || a == 'U'){
            return true;
        }
        else{
            return false;
        }
    }
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int i=0;
        int j=word.length - 1;
        while(i<j){
            while(i<j && !checkvowel(word[i])) i++;
            while(i<j && !checkvowel(word[j])) j--;

            if(i < j){
                char temp=word[i];
                word[i] = word[j];
                word[j] = temp;
                i++;
                j--;
            }
        }
        return new String(word);
    }

    public static void main(String[] args) {
        Solution345 sol = new Solution345();
        String input = "leetcode";
        String result = sol.reverseVowels(input);
        System.out.println("Original: " + input);
        System.out.println("After reversing vowels: " + result);
    }
}
