#include <iostream>
#include <algorithm>
#include <iomanip>
#include <chrono>
#include "bubbleSort.h"
#include "selectionSort.h"
#include "insertionSort.h"
#include "heapSort.h"
#include "mergeSort.h"
#include "quickSort.h"
#include "bucketSort.h"

using namespace std;
using namespace std::chrono;

enum Algorithms {BUBBLE, SELECTION, INSERTION, HEAP, MERGE, QUICK, BUCKET};

void printSortedArray(int data[], int size);
void printTime(double time, string algo, int colWidth);
double testTime(int data[], int size, Algorithms algo);

int main()
{
	double time = 0;
	int SIZE = 1000;
	int* data = new int[SIZE];
	for (int i = 0; i < SIZE; i++) {
		data[i] = i;
	}
	random_shuffle(data, data + SIZE - 1);

	cout << setw(20) << "Algorithm:" << setw(20) << "Time in seconds:" << "\n";

	time = testTime(data, SIZE, BUBBLE);
	printTime(time, "Bubble sort ", 20);
	//printSortedArray(data, SIZE);
	random_shuffle(data, data + SIZE - 1);


	time = testTime(data, SIZE, SELECTION);
	printTime(time, "Selection sort ", 20);
	random_shuffle(data, data + SIZE - 1);


	time = testTime(data, SIZE, INSERTION);
	printTime(time, "Insertion sort ", 20);
	random_shuffle(data, data + SIZE - 1);*/


	time = testTime(data, SIZE, HEAP);
	printTime(time, "Heap ", 20);
	random_shuffle(data, data + SIZE - 1);


	time = testTime(data, SIZE, MERGE);
	printTime(time, "Merge sort ", 20);
	random_shuffle(data, data + SIZE - 1);

	
	time = testTime(data, SIZE, QUICK);
	printTime(time, "Quick sort ", 20);
	random_shuffle(data, data + SIZE - 1);
	 

	time = testTime(data, SIZE, BUCKET);
	printTime(time, "Bucket sort ", 20);

	cout << "--------END OF SEARCHING-----------";
	cin.get();

	delete[] data;

	return 0;
}

void printSortedArray(int data[], int size)
{
	for (int i = 0; i < size; i++)
	{
		cout << data[i] << " ";
	}
	cout << "\n";
}


void printTime(double time, string algo, int colWidth)
{	
	cout << setw(colWidth) << algo << setw(colWidth) << fixed << setprecision(8) << time << "\n";
}

double testTime(int data[], int size, Algorithms algo) 
{
	auto start = high_resolution_clock::now();
	auto end = high_resolution_clock::now();
	int* bucket = NULL;
	switch (algo)
	{
	case BUBBLE:
		start = high_resolution_clock::now();
		bubble_sort(data, size);
		end = high_resolution_clock::now();
		break;
	case SELECTION:
		start = high_resolution_clock::now();
		selection_sort(data, size);
		end = high_resolution_clock::now();
		break;
	case INSERTION:
		start = high_resolution_clock::now();
		insertion_sort(data, size);
		end = high_resolution_clock::now();
		break;
	case HEAP:
		start = high_resolution_clock::now();
		heap_sort(data, size);
		end = high_resolution_clock::now();
		break;
	case MERGE:
		start = high_resolution_clock::now();
		merge_sort(data, 0, size - 1);
		end = high_resolution_clock::now();
		break;
	case QUICK:
		start = high_resolution_clock::now();
		quick_sort(data, 0, size - 1);
		end = high_resolution_clock::now();
		break;
	case BUCKET:
		start = high_resolution_clock::now();
		bucket = bucket_sort(data, size - 1);
		end = high_resolution_clock::now();
		break;
	default:
		break;
	}
	delete[] bucket;
	double time_taken = chrono::duration_cast<chrono::nanoseconds>(end - start).count();
	return time_taken * 1e-9;
}