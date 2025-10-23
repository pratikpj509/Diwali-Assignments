//Coding Challenges
//4. You are given an integer array nums and an integer k. Rotate the array to the
//right by k steps, where k is non-negative.

import java.util.Arrays;

public class CodingChallenge {

	public static void main(String[] args) {
		int[] nums= {2, 3, 5, 1, 7, 9};
		int k=3;
		System.out.println("Before rotating "+Arrays.toString(nums));
		int[] arr=rotateByK(nums,k);
		System.out.println("After Rotating Arrray "+Arrays.toString(arr));

	}

	private static int[] rotateByK(int[] nums,int k) {
		
		int n = nums.length;
		int[] temp =new int[n];
		k=k%n;
		
		for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            temp[newIndex] = nums[i];
        }
		return temp;
	}

}
