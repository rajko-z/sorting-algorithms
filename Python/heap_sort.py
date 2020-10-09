import time
import random


def _downheap(lista, size, index):
    if index * 2 + 1 >= size: return
    left = index * 2 + 1
    right = index * 2 + 2
    if right == size: right -= 1

    if lista[index] > max(lista[left], lista[right]): return

    down_next = left

    if lista[left] >= lista[right] and lista[index] < lista[left]:
        lista[index], lista[left] = lista[left], lista[index]
    elif lista[right] > lista[left] and lista[index] < lista[right]:
        lista[index], lista[right] = lista[right], lista[index]
        down_next = right

    _downheap(lista, size, down_next)


def heap_sort(lista):
    size = len(lista)
    for i in range(len(lista) // 2 - 1, -1, -1):
        _downheap(lista, size, i)

    for i in range(size - 1, -1, -1): 
        lista[0], lista[i] = lista[i], lista[0]
        _downheap(lista, i, 0)


if __name__ == '__main__':
    lista = [_ for _ in range(1000)]
    random.shuffle(lista)
    start_time = time.time()
    heap_sort(lista)
    end_time = time.time()
    print("Time: ", end_time - start_time)
    print(lista)



