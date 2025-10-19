import java.util.List;

public class LenOfLongString {

	    int findLongestLength(String[] words) {
	        int maxLength = 0;

	        for (int i = 0; i < words.length; i++) {
	            int len = words[i].length();
	            if (len > maxLength) {
	                maxLength = len;
	            }
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {
	    	
	    	LenOfLongString obj= new LenOfLongString();
	    	
	        String[] words = {"Pratik", "piya", "muskan", "sonika", "Priyallllll", "Rupesh"};
	        
	        int result = obj.findLongestLength(words);

	        System.out.println("Length of the longest string: " + result);
	    }

		
}


