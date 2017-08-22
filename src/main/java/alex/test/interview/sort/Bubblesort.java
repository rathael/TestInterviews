package alex.test.interview.sort;

public class Bubblesort {

	public Bubblesort() {
	}

	public void sort(int[] data) {
		System.out.print("Bubblesort = ");
		
		int temp;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 1; j < data.length - i; j++) {
				if (data[j] < data[j-1]) {
					temp = data[j-1];
					data[j-1] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
	}
}
