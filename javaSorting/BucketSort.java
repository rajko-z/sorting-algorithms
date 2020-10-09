package javaSorting;

public class BucketSort {

	public static int[] sort(int[] array) {
		int size = array.length;
		int[] bucketArray = new int[size];
		for (int i = 0; i < array.length; i++) {
			bucketArray[i] = i;
		}
		return bucketArray;
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
		int[] sorted = sort(data);
		float elapsed = (System.currentTimeMillis() - start) / 1000;

		printSortedArray(sorted);
		System.out.println(elapsed);
	}
}
