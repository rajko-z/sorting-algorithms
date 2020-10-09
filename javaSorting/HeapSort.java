package javaSorting;

public class HeapSort {

	private static void downHeap(int[] data, int size, int index) {
		if (index * 2 + 1 >= size)
			return;
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		if (right == size)
			right -= 1;

		if (data[index] > Math.max(data[left], data[right]))
			return;

		int down_next = left;

		if (data[left] >= data[right] && data[index] < data[left]) {
			int temp = data[left];
			data[left] = data[index];
			data[index] = temp;
		} else if (data[right] > data[left] && data[index] < data[right]) {
			int temp = data[right];
			data[right] = data[index];
			data[index] = temp;
			down_next = right;
		}
		downHeap(data, size, down_next);
	}

	public static void sort(int[] data) {
		int size = data.length;
		for (int i = size / 2 - 1; i >= 0; i--) {
			downHeap(data, size, i);
		}
		for (int i = size - 1; i >= 0; i--) {
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			downHeap(data, i, 0);
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
		sort(data);

		printSortedArray(data);

	}
}
