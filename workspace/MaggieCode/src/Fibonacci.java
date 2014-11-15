
public class Fibonacci {
	public static void main(String[] array){
		int input = 200;
		int[] fib = new int[20];
		fib[0] = 0;
		fib[1] = 1;
		int arrayLength = fib.length;
		
		for (int i=2; i<= arrayLength; i++){
			fib[i] = fib[i-2] + fib[i-1];
			if(fib[i] > input){
				int multiple = 0;
				multiple = i-1;
				break;
			}
		}
		System.out.print("The Fibonacci series is: ");
		for (int i=0; i<= arrayLength; i++){
			System.out.print(fib[i] + "  ");
		}
	}
}
