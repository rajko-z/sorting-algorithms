package javaSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSortArrayList {

	private static int partition(List<Integer> data, Integer left, Integer right) {
		Integer pivot = data.get(right);
		int i = left - 1;
		for (int j = left; j < right; j++) {
			Integer elem1 = data.get(j);
			if (elem1 <= pivot) {
				i++;
				Integer elem2 = data.get(i);
				data.set(i, elem1);
				data.set(j, elem2);
			}
		}
		i++;
		Integer elem1 = data.get(i);
		Integer elem2 = data.get(right);
		data.set(i, elem2);
		data.set(right, elem1);
		return i;
	}

	public static void sort(List<Integer> data, Integer left, Integer right) {
		if (left < right) {
			int pivot = partition(data, left, right);
			sort(data, left, pivot - 1);
			sort(data, pivot + 1, right);
		}
	}

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			data.add(i);
		}

		Collections.shuffle(data);

		long start = System.currentTimeMillis();
		QuickSortArrayList.sort(data, 0, data.size() - 1);
		float elapsed = (System.currentTimeMillis() - start) / 1000;

		data.stream().forEach(System.out::println);
		System.out.println(elapsed);
	}
}
