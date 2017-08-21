package alex.test.interview.sort;

public class Bubblesort {

	public Bubblesort() {
	}

	public void sort(int[] data) {
		int temp;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j+1] < data[j]) {
					temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
