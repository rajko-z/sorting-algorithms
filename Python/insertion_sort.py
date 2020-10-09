import time
import random

def insertion_sort(data):
	for i in range(1, len(data)):
		j = i - 1
		while j >= 0:
			if data[i] >=data[j]:
				break
			else:
				data[i],data[j] = data[j], data[i]
				i = j
				j -= 1


if __name__ == '__main__':
	lista = [_ for _ in range(1000)]
	random.shuffle(lista)
	start_time = time.time()
	insertion_sort(lista)
	end_time = time.time()
	print("Time: ", end_time - start_time)
	print(lista)