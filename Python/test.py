import time
import random
from bubble_sort import bubble_sort
from selection_sort import selection_sort
from insertion_sort import insertion_sort
from merge_sort import merge_sort
from quick_sort import quick_sort
from heap_sort import heap_sort
from bucket_sort import bucket_sort

BUBBLE_SORT = 0
SELECTION_SORT = 1
INSERTION_SORT = 2
HEAP_SORT = 3
MERGE_SORT = 4
QUICK_SORT = 5
BUCKET_SORT = 6

def get_time(algorithm, data):
	if algorithm == BUBBLE_SORT:
		start_time = time.time()
		bubble_sort(data) 
		end_time = time.time()
	elif algorithm == SELECTION_SORT:
		start_time = time.time()
		selection_sort(data) 
		end_time = time.time()
	elif algorithm == INSERTION_SORT:
		start_time = time.time()
		insertion_sort(data) 
		end_time = time.time()
	elif algorithm == HEAP_SORT:
		start_time = time.time()
		heap_sort(data) 
		end_time = time.time()
	elif algorithm == MERGE_SORT:
		start_time = time.time()
		merge_sort(data) 
		end_time = time.time()
	elif algorithm == QUICK_SORT:
		start_time = time.time()
		quick_sort(data, 0, len(data) - 1) 
		end_time = time.time()
	elif algorithm == BUCKET_SORT:
		start_time = time.time()
		bucket_sort(data) 
		end_time = time.time()
	return end_time - start_time



if __name__ == '__main__':
	SIZE = 10000000
	data = [_ for _ in range(SIZE)]
	random.shuffle(data)

	print("{:<20}{:>10}".format("Algorithm:", "Time:"))
	# print("{:<20}{:>10}".format("Bubble sort", get_time(BUBBLE_SORT, data)))
	# random.shuffle(data)
	# print("{:<20}{:>10}".format("Selection sort", get_time(SELECTION_SORT, data)))
	# random.shuffle(data)
	# print("{:<20}{:>10}".format("Insertion sort", get_time(INSERTION_SORT, data)))
	# random.shuffle(data)
	print("{:<20}{:>10}".format("Heap sort", get_time(HEAP_SORT, data)))
	random.shuffle(data)
	print("{:<20}{:>10}".format("Merge sort", get_time(MERGE_SORT, data)))
	random.shuffle(data)
	print("{:<20}{:>10}".format("Quick sort", get_time(QUICK_SORT, data)))
	random.shuffle(data)
	print("{:<20}{:>10}".format("Bucket sort", get_time(BUCKET_SORT, data)))

