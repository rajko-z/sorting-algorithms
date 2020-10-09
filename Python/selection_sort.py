import time
import random

def selection_sort(data):
	for i in range(len(data) - 1):
		for j in range(i+1, len(data)):
			if data[j] < data[i]:
				data[j],data[i] = data[i],data[j]

if __name__ == '__main__':
	lista = [_ for _ in range(1000)]
	random.shuffle(lista)
	start_time = time.time()
	selection_sort(lista)
	end_time = time.time()
	print("Time: ", end_time - start_time)
	print(lista)
