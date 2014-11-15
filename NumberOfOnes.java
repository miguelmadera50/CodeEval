package medium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfOnes {

	public static void main (String[] args) throws IOException {
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	    	System.out.println(bitcount(Integer.parseInt(line)));
	    }
	}

	/**
	 * Uses a bitmask to determine the total amount of "1" 
	 * bits within the Integer.
	 * 
	 * @param num
	 * @return
	 */
	private static int bitcount(int num) {
		int sum = 0;
		for(int i = 1; i <= 32; i++){
			
			// Bit shift to each position, masked with 1;
			sum += (num >> i) & 1;			
		}		
		return sum;
	}
}
