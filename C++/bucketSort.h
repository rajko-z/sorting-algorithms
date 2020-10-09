#pragma once

int* bucket_sort(int data[], int size)
{
	int* bucket_array = new int[size];
	for (int i = 0; i < size; i++) {
		bucket_array[i] = i;
	}
	return bucket_array;
}