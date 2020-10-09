package javaSorting;

public class Test {

	public enum Algorithms {
		BUBBLE, SELECTION, INSERTION, HEAP, MERGE, QUICK, BUCKET
	};

	private static double testTime(int data[], Algorithms algo) {
		long start;
		double elapsed = 0.0d;

		switch (algo) {
		case BUBBLE:
			start = System.currentTimeMillis();
			BubbleSort.sort(data);
			elapsed = (double) (System.currentTimeMillis() - start) / 1000;
			break;
		case SELECTION:
			start = System.currentTimeMillis();
			SelectionSort.sort(data);
			elapsed = (double) (System.currentTimeMillis() - start) / 1000;
			break;
		case INSERTION:
			start = System.currentTimeMillis();
			InsertionSort.sort(data);
			elapsed = (double) (System.currentTimeMillis() - start) / 1000;
			break;
		case HEAP:
			start = System.currentTimeMillis();
			HeapSort.sort(data);
			elapsed = (double) (System.currentTimeMillis() - start) / 1000;
			break;
		case MERGE:
			start = System.currentTimeMillis();
			MergeSort.sort(data, 0, data.length - 1);
			elapsed = (double) (System.currentTimeMillis() - start) / 1000;
			break;
		case QUICK:
			start = System.currentTimeMillis();
			QuickSort.sort(data, 0, data.length - 1);
			elapsed = (double) (System.currentTimeMillis() - start) / 1000;
			break;
		case BUCKET:
			start = System.currentTimeMillis();
			BucketSort.sort(data);
			elapsed = (double) (System.currentTimeMillis() - start) / 1000;
			break;
		default:
			break;
		}
		return elapsed;
	}
	
	private static void printSortedArray(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {

		double elapsed;
		int SIZE = 1000;

		int[] data = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			data[i] = i;
		}
		Shuffle.shuffleData(data);

		System.out.printf("%25s %25s\n", "Algorithm:", "Time in seconds:");

		elapsed = testTime(data, Algorithms.BUBBLE);
		System.out.printf("%25s %25s\n", "Bubble sort", elapsed);
		//printSortedArray(data);
		
		Shuffle.shuffleData(data);
		elapsed = testTime(data, Algorithms.SELECTION);
		System.out.printf("%25s %25s\n", "Selection sort", elapsed);
		
		Shuffle.shuffleData(data);
		elapsed = testTime(data, Algorithms.INSERTION);
		System.out.printf("%25s %25s\n", "Insertion sort", elapsed);
		
		Shuffle.shuffleData(data);
		elapsed = testTime(data, Algorithms.HEAP);
		System.out.printf("%25s %25s\n", "Heap sort", elapsed);
		
		Shuffle.shuffleData(data);
		elapsed = testTime(data, Algorithms.MERGE);
		System.out.printf("%25s %25s\n", "Merge sort", elapsed);
		
		Shuffle.shuffleData(data);
		elapsed = testTime(data, Algorithms.QUICK);
		System.out.printf("%25s %25s\n", "Quick sort", elapsed);
		
		Shuffle.shuffleData(data);
		elapsed = testTime(data, Algorithms.BUCKET);
		System.out.printf("%25s %25s\n", "Bucket sort", elapsed);
		
	}
}
