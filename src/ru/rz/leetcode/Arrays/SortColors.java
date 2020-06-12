package ru.rz.leetcode.Arrays;

//class Solution {
//    public void sortColors(int[] nums) {
//        int[] counts = new int[3];
//        for (int i = 0; i < nums.length; ++i)
//        	++counts[nums[i]];
//        
//        int i = 0;
//        for (int j = 0; j < 3; ++j) {
//        	for (int k = 0; k < counts[j]; ++k) {
//        		nums[i++] = j;
//        	}
//        }
//    }
//}

class Solution {
    public void sortColors(int[] nums) {
        int i0 = 0, i2 = nums.length - 1;
    }
}

public class SortColors {
	
	private static void printArr(int[] nums) {
		for (int i = 0; i < nums.length; ++i)
			System.out.print(String.format("%d ", nums[i]));
	}

	public static void main(String[] args) {
		int[] nums = new int[] {2,0,2,1,1,0};
		new Solution().sortColors(nums);
		printArr(nums); // 0,0,1,1,2,2
	}

}
