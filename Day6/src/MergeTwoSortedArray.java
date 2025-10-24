import java.util.*;
public class MergeTwoSortedArray {
	

	    public static void main(String[] args) {
	        int[] nums1 = {1, 3, 5, 7};
	        int[] nums2 = {2, 4, 6, 8, 10};

	        int[] merged = mergeArrays(nums1, nums2);

	        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
	    }

	    public static int[] mergeArrays(int[] nums1, int[] nums2) {
	        int n1 = nums1.length;
	        int n2 = nums2.length;
	        int[] result = new int[n1 + n2];
	        
	        int i = 0, j = 0, k = 0;

	        // Merge both arrays
	        while (i < n1 && j < n2) {
	            if (nums1[i] <= nums2[j]) {            	
	                result[k++] = nums1[i++];	            
	                
	            } else {
	                result[k++] = nums2[j++];
	            }
	        }

	        // Copy remaining elements (if any)
	        while (i < n1) {
	            result[k++] = nums1[i++];
	        }

	        while (j < n2) {
	            result[k++] = nums2[j++];
	        }

	        return result;
	    }
}
