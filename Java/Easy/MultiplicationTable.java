package easy;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int[] numbers = new int[12];	
		
		for(int i = 0; i < 12; i++){
			numbers[i] = i + 1;
		}
		
		for(int i = 0; i < 12; i++){
			for(int j = 0; j < 12; j++){
				
				// Formated String adds padding
				System.out.printf("%4d", numbers[i] * numbers[j]);
			}
			System.out.println();
		}
	}
}