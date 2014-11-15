package easy;
public class Sum1000Primes {

	public static void main(String[] args) {
		int numberPrimes = 0;
		int sum = 0; 
		int i = 2;
		
		while(numberPrimes < 1000){
			if(prime(i)){ 
				sum += i;
				numberPrimes++;
			}
			i++;
		}
		System.out.println(sum);
	}

	private static boolean prime(int num) {
				
		for(int i = 2; i < num; i++){
			if(num % i == 0) return false;
		}
		return true;
	}
}
