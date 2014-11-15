
public class FibonacciSequence {
	public static void main(String[] args){
		/* Number of places */
		int input = 20;
		
		int previousNumber = 0;
		int[] sequenceList = new int[input];
		sequenceList[0] = 0;
		sequenceList[1] = 1;

		
		for (int i = 2; i <= input-1; i++){
			sequenceList[i] = sequenceList [i-1] + sequenceList [i-2];
		}
		System.out.print("The Fibnacci Series is: ");
		for (int i = 0; i < sequenceList.length; i++){
			System.out.print(sequenceList[i] + "  ");
		}	
	}
}

