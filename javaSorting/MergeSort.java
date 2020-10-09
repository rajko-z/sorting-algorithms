package javaSorting;

public class MergeSort {

	private static void merge(int data[], int left_a, int middle, int right_b) {
		int lsize = (middle - left_a) + 1;
		int rsize = right_b - middle;

		int left[] = new int[lsize];
		int right[] = new int[rsize];

		for (int i = 0; i < lsize; i++) {
			left[i] = data[left_a + i];
		}
		for (int i = 0; i < rsize; i++) {
			right[i] = data[middle + 1 + i];
		}

		int i = 0, j = 0, br = left_a;
		while (i < lsize && j < rsize) {
			if (left[i] < right[j]) {
				data[br] = left[i];
				i++;
			} else {
				data[br] = right[j];
				j++;
			}
			br++;
		}

		if (i < lsize) {
			for (int k = i; k < lsize; k++) {
				data[br] = left[k];
				br++;
			}
		} else {
			for (int k = j; k < rsize; k++) {
				data[br] = right[k];
				br++;
			}
		}
		left = null;
		right = null;
	}

	public static void sort(int data[], int left, int right) {
		if (left < right) {
			int middle = left + (right - left) / 2;
			sort(data, left, middle);
			sort(data, middle + 1, right);
			merge(data, left, middle, right);
		}
		return;
	}

	private static void printSortedArray(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

	public static void main(String[] args) {
		int SIZE = 1000;
		int[] data = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			data[i] = i;
		}
		Shuffle.shuffleData(data);

		long start = System.currentTimeMillis();
		sort(data, 0, SIZE - 1);
		float elapsed = (System.currentTimeMillis() - start) / 1000;

		printSortedArray(data);
		System.out.println(elapsed);
	}
}
