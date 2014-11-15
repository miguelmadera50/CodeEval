package easy;
public class PrimePalindrome {

	public static void main(String[] args) {
		
		int answer = 2;
		for(int i = 2; i < 1000; i ++){
			if(palindromeCheck(i)){
				if (primeCheck(i)) answer = i;				
			}
		}
		System.out.println(answer);		
	}
	
	/**
	 * Checks whether a number is equal to its "reverse"
	 * @param num Possible palindrome Integer
	 * @return True if the number is a palindrome, false otherwise
	 */
	private static boolean palindromeCheck(int num) {
		String str = "";
		str += num;
		String rev = new StringBuilder(str).reverse().toString();
		
		//Number is palindrome if it is equal to its reversal
		if(str.equals(rev)) return true;
		return false;
	}

	/**
	 * Checks number primality. Only necessary to check up to sqrt(x)
	 * @param x Integer to be checked
	 * @return true if number is prime, false otherwise
	 */
	private static boolean primeCheck(int x){
		
		//Only necessary to check up to the square root of 
		//the number being checked.
		for (int i = 2; i <= Math.ceil(Math.sqrt(x)); i++){
			if(x % i == 0) return false;
		}
		return true;
	}
}
