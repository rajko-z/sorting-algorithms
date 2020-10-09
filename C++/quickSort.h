#pragma once
int partition(int data[], int left, int right)
{
	int pivot = data[right];
	int i = left - 1;
	for (int j = left; j < right; j++)
	{
		if (data[j] <= pivot)
		{
			i++;
			int temp = data[i];
			data[i] = data[j];
			data[j] = temp;
		}
	}
	i++;
	int temp = data[i];
	data[i] = data[right];
	data[right] = temp;
	return i;
}


void quick_sort(int data[], int left, int right)
{
	if (left < right)
	{
		int pivot = partition(data, left, right);
		quick_sort(data, left, pivot - 1);
		quick_sort(data, pivot + 1, right);
	}
}