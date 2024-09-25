package demo;

import java.util.Arrays;

public class Solutions {

	    public static int removeElement(int[] nums, int val) {
	        int k = 0; // Represents the number of elements not equal to val

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }

	        return k;
	    }

	    public static void main(String[] args) {
	        int[] nums = {3, 2, 3, 4, 5, 6,2};
	        int val = 3;

	        int result = removeElement(nums, val);

	        System.out.println("The new array is:");
	        for (int i = 0; i < result; i++) {
	            System.out.print(nums[i] + " ");
	        }

	        System.out.println("\nThe number of elements not equal to " + val + " is: " + result);
	    }
	}

