
public class MergeSorter {
	
	public void sort(int[] data) {
		mergeSort(data, 0, data.length-1);
	}
	
	private void mergeSort (int[] A, int start, int end) {
		if (start < end) {
			int middle = (int) Math.floor((end + start)/2);
			mergeSort(A, start, middle);
			mergeSort(A, middle + 1, end);
			merge(A, start, middle, end);
		}
	}
	
	private void merge (int[] A, int start, int middle, int end) {
		int sizeOfLeft = middle - start + 1;
		int sizeOfRight = end - middle;
		int[] left = new int[sizeOfLeft];
		int[] right = new int[sizeOfRight];
		for (int i = 0; i < sizeOfLeft; i++) {
			left[i] = A[start + i];
		}
		for (int j = 0; j < sizeOfRight; j++) {
			right[j] = A[middle + 1 + j];
		}
		int i = 0; 
		int j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				A[k] = left[i];
				i++;
			} else {
				A[k] = right[j];
				j++;
			}
		}
	}

}
