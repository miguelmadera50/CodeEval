package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FizzBuzz {

	public static void main (String[] args) 
			throws NumberFormatException, IOException {
	    
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	        String[] lineArray = line.split(" ");
	        if (lineArray.length > 0) {
	        	
	        	System.out.println(
						fizzBuzz(Integer.parseInt(lineArray[0]), 
								Integer.parseInt(lineArray[1]),
								Integer.parseInt(lineArray[2])));
	        }
	    }
	}
	
	/**
	 * Returns a String with digits from 1 to max where multiples
	 * "fizz" and "buzz" are replaced with "F" and "B" respectively
	 * 
	 * @param fizz Integer Multiple to be replaced with "F"
	 * @param buzz Integer Multiple to be replaced with "F"
	 * @param max Maximum number to be printed or replaced (inclusive)
	 * @return formated String divided by spaces
	 */
	private static String fizzBuzz(int fizz, int buzz, int max) {
		String str = "";
		for(int i = 1; i <= max; i++){
						
			if(i % fizz != 0 && i % buzz != 0){
				str += i;
			}
			else{
				
				// Individual Ifs permit "FB"
				if(i % fizz == 0) str += "F";
				if(i % buzz == 0) str += "B";				
			}
			str += " ";
		}
		
		// Removes trailing space
		return str.substring(0, str.length() - 1);
	}
}
