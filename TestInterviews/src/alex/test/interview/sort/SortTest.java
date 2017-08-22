package alex.test.interview.sort;

public class SortTest {

	public SortTest() {
	}

	public static void main(String[] args) {
		int[] data = {50, 26, 7, 9, 15, 27};
		
		Bubblesort bubblesort = new Bubblesort();
		
		// Se espera 7 9 15 26 27 50 
		bubblesort.sort(data);
		
		data = new int[]{50, 26, 7, 9, 15, 27};
		Mergesort mergesort = new Mergesort();
		mergesort.sort(data);
	}

}
