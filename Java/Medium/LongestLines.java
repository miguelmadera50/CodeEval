package medium;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class LongestLines {
	
	public static void main (String[] args) throws IOException {
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    
	    // First line is always the integer
	    String line = in.readLine();	    
	    int num = Integer.parseInt(line);
	    	    
	    ArrayList<String> lineArray = new ArrayList<String>();
	    
	    while ((line = in.readLine()) != null) {
	        lineArray.add(line);  
	    }
	    System.out.println(longest(lineArray, num));	    
	}

	/**
	 * Uses a custom Comparator to sort the ArrayList and return
	 * the N largest Strings
	 * 
	 * @param str ArrayList of all Strings to be compared
	 * @param num Amount of Strings to return
	 * @return N longest Strings from ArrayList
	 */
	private static String longest(ArrayList<String> str, int num){	
		
		Collections.sort(str, new LenCompare());
		
		String result = "";
		for(int i = 0; i < num; i++){
			result += str.get(i) + "\n";
		}
		
		return result.substring(0, result.length() - 1);
	}	
	
	/**
	 * Custom implementation of Comparator interface 	 * 
	 * 
	 * @author Miguel Madera	 *
	 */
	public static class LenCompare implements java.util.Comparator<String>{

		@Override
		public int compare(String str1, String str2) {
			
			// Applies sort in descending order by lengths
			return str2.length() - str1.length();
		}
	}
}



