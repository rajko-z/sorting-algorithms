import random
import time

def bucket_sort(data):
	bucket_array = [None] * len(data)
	for item in data:
		bucket_array[item] = item
	return bucket_array

if __name__ == '__main__':
	lista = [_ for _ in range(1000000)]
	random.shuffle(lista)
	start_time = time.time()
	lista = bucket_sort(lista)
	end_time = time.time()
	print("Time: ", end_time - start_time)
	