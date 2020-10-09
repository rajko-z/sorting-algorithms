package javaSorting;

public class QuickSort {

	public static int partition(int data[], int left, int right) {
		int pivot = data[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (data[j] <= pivot) {
				i++;
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		i++;
		int temp = data[i];
		data[i] = data[right];
		data[right] = temp;
		return i;
	}

	public static void sort(int data[], int left, int right) {
		if (left < right) {
			int pivot = partition(data, left, right);
			sort(data, left, pivot - 1);
			sort(data, pivot + 1, right);
		}
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
