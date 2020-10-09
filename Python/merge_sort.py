import time
import random

def merge(left, right):
	ret_list = []
	lsize = len(left)
	rsize = len(right)
	i = 0
	j = 0
	while i < lsize and j < rsize:
		if left[i] < right[j]:
			ret_list.append(left[i])
			i += 1
		else:
			ret_list.append(right[j])
			j += 1
	ret_list.extend(left[i:]) if i < lsize else ret_list.extend(right[j:])
	return ret_list

def merge_sort(data):
	size = len(data)
	if size == 1:
		return data
	middle = size // 2
	l_sorted = merge_sort(data[:middle])
	r_sorted = merge_sort(data[middle:])
	return merge(l_sorted, r_sorted)


if __name__ == '__main__':
	lista = [_ for _ in range(1000000)]
	random.shuffle(lista)
	start_time = time.time()
	lista = merge_sort(lista)
	end_time = time.time()
	print("Time: ", end_time - start_time)
	#print(lista)