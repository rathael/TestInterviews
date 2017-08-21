package alex.test.interview.sort;

public class SortTest {

	public SortTest() {
	}

	public static void main(String[] args) {
		int[] data = {50, 26, 7, 9, 15, 27};
		
		Bubblesort bubblesort = new Bubblesort();
		
		bubblesort.sort(data);
		
	}

}
