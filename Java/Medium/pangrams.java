package medium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pangrams {
	
	public static void main (String[] args) throws IOException {
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	        System.out.println(pangram(line.toLowerCase()));
	    }
	}

	/** 
	 * Removes characters from the alphabet as it finds them
	 * @param str Possible pangram
	 * @return letters missing from String, otherwise the String "NULL"
	 */
	private static String pangram(String str) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";	
		String letter = "";
		
		for (int i = 0; i < str.length(); i++){		
			letter = "" + str.charAt(i);
			
			if(alphabet.contains(letter)){
				alphabet = alphabet.replace(letter, "");
			}
		}
		return (alphabet.equals(""))? "NULL" : alphabet;
	}
}
