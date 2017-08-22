package alex.test.interview.sort;

/**
 * Mergesort is a so called divide and conquer algorithm
 * 
 * @author alex
 *
 */
public class Mergesort {

	public Mergesort() {
	}

	
	public void sort(int[] data) {
		System.out.print("Mergesort = ");
		
		mergeSort(data, 0, data.length-1);
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
	}
	
	private void mergeSort(int[] data, int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;
			
			mergeSort(data, lowIndex, middleIndex);
			mergeSort(data, middleIndex + 1, highIndex);
			
			mergeParts(data, lowIndex, middleIndex, highIndex);
		}
	}


	private void mergeParts(int[] data, int lowIndex, int middleIndex, int highIndex) {
		int[] tempData = new int[data.length];
		
		for (int i=lowIndex; i<=highIndex; i++) {
			tempData[i] = data[i];
		}
		
		int indexLeft = lowIndex;
		int indexRight = middleIndex+1;
		int current = lowIndex;
		
		while (indexLeft <= middleIndex && indexRight <= highIndex) {
			if (tempData[indexLeft] <= tempData[indexRight]) {
				data[current] = tempData[indexLeft];
				indexLeft++;
			} else {
				data[current] = tempData[indexRight];
				indexRight++;
			}
			current++;
		}
		
		int remaining = middleIndex - indexLeft;
		for (int i = 0; i <= remaining; i++) {
			data[current+i] = tempData[indexLeft+ i];
		}
	}
}
