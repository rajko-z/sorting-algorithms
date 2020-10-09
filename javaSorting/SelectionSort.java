package javaSorting;

public class SelectionSort {

	public static void sort(int data[]) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[i]) {
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
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
		sort(data);
		float elapsed = (System.currentTimeMillis() - start) / 1000;

		printSortedArray(data);
		System.out.println(elapsed);

	}
}
