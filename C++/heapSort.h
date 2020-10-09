#pragma once
#include <iostream>
#include <algorithm>
void downHeap(int data[], int size, int index)
{
	if (index * 2 + 1 >= size) return;
	int left = index * 2 + 1;
	int right = index * 2 + 2;
	if (right == size) right -= 1;

	if (data[index] > std::max(data[left], data[right])) return;

	int down_next = left;

	if (data[left] >= data[right] && data[index] < data[left])
	{
		std::swap(data[index], data[left]);
	}
	else if (data[right] > data[left] && data[index] < data[right])
	{
		std::swap(data[index], data[right]);
		down_next = right;
	}
	downHeap(data, size, down_next);
}


void heap_sort(int data[], int size)
{
	for (int i = size / 2 - 1; i >= 0; i--)
	{
		downHeap(data, size, i);
	}
	for (int i = size - 1; i >= 0; i--)
	{
		std::swap(data[0], data[i]);
		downHeap(data, i, 0);
	}
}