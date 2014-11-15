package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWords {

	public static void main (String[] args) throws IOException {
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
            System.out.println(reverseWords(line));	        
	    }
	  }
	
	/**
	 * Splits a string into an array of words and
	 * returns a reverse of that array as a String.
	 * 
	 * @param str String with words to be reversed
	 * @return String with reveresed words
	 */
	public static String reverseWords(String str){
		String result = "";
		if (str.isEmpty()) return result;
		
		String[] words = str.split(" ");
			
		for(int i = words.length; i > 0; i--){
			result += words[i - 1] + " ";
		}
		
		return result.substring(0, result.length() - 1);
	}
}