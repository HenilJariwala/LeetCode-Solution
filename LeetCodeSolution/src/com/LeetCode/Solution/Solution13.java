// 13. Integer to Roman

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

 

// Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.
// Example 2:

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// Example 3:

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

package com.LeetCode.Solution;

public class Solution13 {
    public int number(String strnew) {
        String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int num=0;
        for (int j = 0; j < romans.length; j++) {
            if (strnew.equals(romans[j])) {
                num=nums[j];
            }
        }
        return num;
    }

    public int romanToInt(String s) {
       
        int i, number = 0;
        s=s+" ";
        for (i = 0; i < s.length()-1; i++) {
            String str = s.substring(i, i + 2);
            int result = number(str);
            if(result != 0) {
                number = number + result;
                i++;
            }
             else {
                    char s1 = str.charAt(0);
                    String ch1 = Character.toString(s1);
                    number = number + number(ch1);
                }
            }
        return number;
    }

    public static void main(String args[]) {
		Solution13 ob1= new Solution13();
		int ans = ob1.romanToInt("XL");
		System.out.println(ans);
	}
}