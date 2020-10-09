#pragma once
void selection_sort(int data[], int size) {
	for (int i = 0; i < size - 1; i++) {
		for (int j = i + 1; j < size; j++) {
			if (data[j] < data[i]) {
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
	}
}
