package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NPrimes {

	public static void main (String[] args) 
			throws NumberFormatException, IOException {
		
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	    	
	    	String str = "2,";
			int n = Integer.parseInt(line);
	    	
			for(int i = 2; i < n; i++){
				if (primeCheck(i)) str += i + ",";
			}	    	
	    	
	    	System.out.println(str.substring(0, str.length() - 1));
	    }
	  }
	
	/**
	 * Checks number primality. Only necessary to check up to sqrt(x)
	 * @param x Integer to be checked
	 * @return true if number is prime, false otherwise
	 */
	private static boolean primeCheck(int x){
		for (int i = 2; i <= Math.ceil(Math.sqrt(x)); i++){
			if(x % i == 0) return false;						
		}
		return true;
	}
}
