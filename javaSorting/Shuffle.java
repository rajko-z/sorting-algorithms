package javaSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void shuffleData(int[] data) {
		List<Integer> list = new ArrayList<>();
		for (int i : data) {
			list.add(i);
		}

		Collections.shuffle(list);

		for (int i = 0; i < list.size(); i++) {
			data[i] = list.get(i);
		}
	}
}
