package javaSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortArrayList {

	private static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> retList = new ArrayList<>();
		int lsize = left.size();
		int rsize = right.size();
		int i = 0;
		int j = 0;
		while (i < lsize && j < rsize) {
			if (left.get(i) < right.get(j)) {
				retList.add(left.get(i));
				i++;
			} else {
				retList.add(right.get(j));
				j++;
			}
		}
		if (i < lsize) {
			retList.addAll(left.subList(i, left.size()));
		} else {
			retList.addAll(right.subList(j, right.size()));
		}
		return retList;
	}

	public static List<Integer> sort(List<Integer> data) {
		int size = data.size();
		if (size == 1)
			return data;
		int middle = size / 2;
		List<Integer> l_sorted = sort(data.subList(0, middle));
		List<Integer> r_sorted = sort(data.subList(middle, data.size()));
		return merge(l_sorted, r_sorted);
	}

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			data.add(i);
		}

		Collections.shuffle(data);

		long start = System.currentTimeMillis();
		List<Integer> dataSorted = MergeSortArrayList.sort(data);
		float elapsed = (System.currentTimeMillis() - start) / 1000;

		// dataSorted.stream().forEach(System.out::println);
		System.out.println(elapsed);
	}
}
