//4. Median of Two Sorted Arrays
//
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
// 
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

package com.LeetCode.Solution;


public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len3 = len1 + len2;
        int nums3[] = new int[len3];
        int k=0;
        for (int i = 0; i < len1; i++) {
            nums3[k++] = nums1[i];
        }
        
        for (int i = 0; i < len2; i++) {
            nums3[k++] = nums2[i];
        }

        for (int i = 0; i < len3; i++) {
            for (int j = 0; j < len3 - 1 - i; j++) {
                if (nums3[j] > nums3[j + 1]) {
                    int temp = nums3[j + 1];
                    nums3[j + 1] = nums3[j];
                    nums3[j] = temp;
                }
            }
        }
        double median;
        if (len3 % 2 == 0) {
            median = (nums3[len3 / 2] + nums3[(len3 / 2) - 1]) / 2.0;
        } else {
            median = nums3[(len3 / 2)];
        }

        return median;
    }
    
    public static void main(String args[]) {
		Solution4 ob1= new Solution4();
		int[] num1= {1,3};
		int[] num2= {2};
		double ans = ob1.findMedianSortedArrays(num1, num2);
		System.out.println(ans);
	}
}