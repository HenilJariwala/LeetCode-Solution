//1.Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
// 
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]


package com.LeetCode.Solution;

import java.util.Arrays;

public class Solution1 {

	    public int[] twoSum(int[] nums, int target) {
	        int sum;
	        int arr[] =new int[2];
	        for(int i=0;i<nums.length;i++){
	            sum=0;
	            for(int j=i+1;j<nums.length;j++){
	                sum = nums[i] + nums[j];
	                if(sum == target){
	                    arr[0]=i;
	                    arr[1]=j;
	                }
	            }            
	        }
	        return arr;
	    }
	
	 public static void main(String args[]) {
			Solution1 ob1= new Solution1();
			int[] num1= {2,7,11,1};
			int[] ans = ob1.twoSum(num1, 9);
			System.out.println(Arrays.toString(ans));
		}

}
