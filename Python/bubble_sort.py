import time
import random

def bubble_sort(data):
	for i in range(len(data) - 1):
		for j in range(len(data) - 1 - i):
			if data[j] > data[j+1]:
				data[j],data[j+1] = data[j+1],data[j]

if __name__ == '__main__':
	lista = [_ for _ in range(1000)]
	random.shuffle(lista)
	start_time = time.time()
	bubble_sort(lista)
	end_time = time.time()
	print("Time: ", end_time - start_time)
	print(lista)
