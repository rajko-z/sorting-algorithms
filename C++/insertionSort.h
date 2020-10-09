#pragma once
void insertion_sort(int data[], int size) {
	for (int i = 1; i < size; i++) {
		int j = i - 1;
		while (j >= 0) {
			if (data[i] >= data[j]) {
				break;
			}
			else {
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;
				i = j;
				j -= 1;
			}
		}
	}
}