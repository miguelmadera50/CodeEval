package medium;

public class removeChars {
	public static void main(String[] args) {
		System.out.println(removeChars("how are you, abc"));				
	}
	
	/**
	 * Splits the String and removes all characters found 
	 * within the second string from the first String.
	 * @param str Search String and removal String with comma in between
	 * @return 
	 */
	private static String removeChars(String str) {
		String[] split = str.split(",");
		
		String message = split[0];
		char[] removals = split[1].trim().toCharArray();
		
		for(char c : removals){
			message = message.replaceAll(""+c, "");
		}
		return message;
	}
}
