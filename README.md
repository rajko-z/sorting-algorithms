# Sorting-Algorithms
  I have implemented some of the well known algorithms in python, java and c++.
There is a test for every language to compare the speed of algorithms. Java algorithms was tested in Eclipse and for c++ in Visual Studio.

  This is just the basis for sorting algorithms, so feel free to add new implementations of other sorting algorithms in any language you like.

### Results
As expected **O(n^2)** algorithms like **bubble sort, selection sort** and **insertion sort** are much slower in comparison to **O(nlogn)** algorithms like **heap sort, merge sort** or **quick sort**.

Although it is unfair to compare languages like this directly, because the speed of execution mostly depends on compilers and interpreters and their optimizations, **python** was the slowest, and **java** and **c++** performed almost the same (some algorithms are faster in java and others in c++).

*So here are the results for sorting first N numbers, where N does't exceed 10^5 for O(n^2) algorithms and 10^8 for faster ones:*
#### O(n^2) algorithms:
- PYTHON

| algorithm        | N= 10 000    | N = 50 000  | N = 100 000 |
| -------------    | -------------| ----------- | ----------- |
| bubble sort      | 19.908 sec   | 481.285 sec  | 2022.921 sec |
| selection sort   | 15.254 sec   | 366.220 sec  | 1511.231 sec |
| insertion sort   | 12.208 sec   | 302.285 sec  | 1245.434 sec  |

- JAVA

| algorithm        | N= 10 000    | N = 50 000  | N = 100 000 |
| -------------    | -------------| ----------- | ----------- |
| bubble sort      | 0.173 sec    | 4.345 sec   | 17.359 sec     |
| selection sort   | 0.148 sec   | 3.902 sec  | 15.686 sec      |
| insertion sort   | 0.066 sec   | 1.917 sec  | 7.632 sec  |

- C++

| algorithm        | N= 10 000    | N = 50 000  | N = 100 000 |
| -------------    | -------------| ----------- | ----------- |
| bubble sort      | 0.161 sec   | 4.253 sec  | 17.257 sec |
| selection sort   | 0.159 sec   | 4.121 sec  | 16.600 sec  |
| insertion sort   | 0.1329 sec   | 2.63 sec  | 10.503 sec  |


#### Faster algorithms:
- PYTHON

| algorithm      | N= 1 000 000 | N = 10 000 000   | N = 100 000 000 |
| -------------  | -------------| ---------------- | --------------- |
| heap sort      | 33.691 sec   | 406.497 sec      | too much :(     |
| merge sort     | 10.344 sec   | 125.416 sec      | ....            |
| quick sort     | 8.621 sec    | 118.312 sec      | ....            |
| bucket sort    | 0.221 sec    | 2.714 sec        | ....            |

- JAVA

| algorithm      | N= 1 000 000 | N = 10 000 000   | N = 100 000 000 |
| -------------  | -------------| ---------------- | --------------- |
| heap sort      | 0.196  sec   | 3.095 sec        | 45.261 sec      |
| merge sort     | 0.207 sec    | 3.155 sec        | 31.644 sec      |
| quick sort     | 0.120 sec    | 1.372 sec        | 15.016 sec      |
| bucket sort    | 0.004 sec    | 0.014 sec        | 0.075 sec       |

- C++

| algorithm      | N= 1 000 000 | N = 10 000 000   | N = 100 000 000 |
| -------------  | -------------| ---------------- | --------------- |
| heap sort      | 0.252  sec   | 3.371   sec      | 50.021 sec      |
| merge sort     | 0.501 sec    | 3.706   sec      | 39.602 sec      |
| quick sort     | 0.114  sec   | 1.104   sec      | 12.331 sec      |
| bucket sort    | 0.003 sec    | 0.026   sec      | 0.268 sec       |

#### Final words
This was run on Intel i5-6300 CPU 2.5 GHz machine. Ofcourse, the results are always a bit different, but I tried to use average values without running a lot of tasks in the background. As you can see, java was faster than c++ in some cases, but at the end it really depends on what compliler and interpreters you are using and what optimizations are performed in a background. 

