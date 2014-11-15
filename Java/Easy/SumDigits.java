package easy;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumDigits {

	public static void main (String[] args) 
			throws NumberFormatException, IOException {
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	    	System.out.println(sumDigits(line));
	    }	
	}

	/**
	 * Returns a simple sum of the integers in a String
	 * 
	 * @param num String of numeric characters
	 * @return Sum of the digits in the String as an Integer
	 */
	private static int sumDigits(String num) {
		int sum = 0;
		String str = num;		
		String[] arr = str.split("");
		
		//Shifts array 1 value to left to remove "" 
		arr = Arrays.copyOfRange(arr, 1, arr.length);

		for(String s : arr){
			sum += Integer.parseInt(s);
		}
		return sum;
	}	
}
