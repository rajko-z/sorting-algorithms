import time
import random

def partition(lista, left, right):
    pivot = lista[right]
    i = left-1
    for j in range(left, right):
        if lista[j] <= pivot:
            i += 1
            lista[i], lista[j] = lista[j], lista[i]
    i += 1
    lista[i], lista[right] = lista[right], lista[i]
    return i


def quick_sort(lista, left, right):
    if left < right:
        pivot = partition(lista, left, right)
        quick_sort(lista, left, pivot-1)
        quick_sort(lista, pivot+1, right)

if __name__ == '__main__':
	lista = [_ for _ in range(1000)]
	random.shuffle(lista)
	start_time = time.time()
	quick_sort(lista, 0, len(lista) - 1)
	end_time = time.time()
	print("Time: ", end_time - start_time)
	
	

