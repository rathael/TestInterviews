package alex.test.interview.fibonacci;

public class Fibonacci {

	public Fibonacci() {
	}

	private int fibonacci(int number) {
		if (number == 0 || number == 1) {
			return number;
		}
		
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	
	public void printFibonacci(int number) {
		for (int i=0; i < number; i++) {
			System.out.print(this.fibonacci(i)+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int number = 10;
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.printFibonacci(number);
		
	}

}
