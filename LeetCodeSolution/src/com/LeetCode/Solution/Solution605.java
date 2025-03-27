//Leetcode 75
// 605. Can Place Flowers

// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false
 
package com.LeetCode.Solution;

public class Solution605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //Method 1 - Bit long
        // int count=0;
        // int size = flowerbed.length+1;
        // int test[]=new int[size];
        // test[0] = 0;
        // test[size-1] = 0;
        // for(int i=1;i<size-1;i++){
        //     if(test[i] != 1){
        //         if(test[i-1] == 0 && test[i+1] == 0){
        //             count++;
        //             test[i] = 1;
        //         }
        //     }
        // }

        // return(count == n);

        //Method - 2 short but quiet tricky 
        int count = 0;
        int size = flowerbed.length;

        for (int i = 0; i < size; i++) {
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == size - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
                i++;  // Skip the next position to prevent adjacent planting
            }
        }
        return(count >= n);
    }
    public static void main(String[] args) {
        Solution605 sol = new Solution605();
        
        int[] flowerbed = {1, 0, 0, 0, 1}; 
        int n = 1; 
        
        boolean result = sol.canPlaceFlowers(flowerbed, n);
        
        System.out.println("Can place " + n + " flowers: " + result);
    }
}
