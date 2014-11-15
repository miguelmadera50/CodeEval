package easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NonRepeatedCharacter {

	public static void main (String[] args) throws IOException {
		
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	    	
			if(line.length() == 0) System.out.println("");
			else System.out.println(recNcr(line.charAt(0), line));		
	    }        
	  }

	/**
	 * Method recursively removes any repetitions of the 
	 * first element (head) from a given String
	 * 
	 * @param head First Character of a given String;
	 * @param str Entirety of String
	 * @return First non-repeated element of the String
	 */
	private static String recNcr(char head, String str) {
		
		// Determines count of characters in str
		int count = str.length() 
				- str.replace(String.valueOf(head), "").length();

		// Returns Answer if remainder of String is Empty
		if(str.equals("") || count == 1)
			return "" + head;
		
		else{
			// String becomes smaller after multiple recursions
			str = str.replace(String.valueOf(head), "");
			
			if(!str.isEmpty()) return recNcr(str.charAt(0), str);
			else return "";
		}
	}
}