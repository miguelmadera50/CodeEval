package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberMultiples {

	public static void main (String[] args) 
			throws NumberFormatException, IOException {
	    
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	        String[] lineArray = line.split(",");
	        if (lineArray.length > 0) {
	        	System.out.println(
						multiples(Integer.parseInt(lineArray[0]), 
								Integer.parseInt(lineArray[1])));
	        }
	    }
    }

	/**
	 * Return smallest multiple of n which is greater or equal to x
	 * @param x
	 * @param n
	 * @return
	 */
	private static int multiples(int x, int n) {
		int i = 1;		
		
		while(true){
			if(n * i >= x) return n * i;
			i++;
		}
	}
}
