# Data-Structure

Variable

Data Type
  1. System Defined Data types(Primitive Data types: int, float etc..)
  2. User defined data types (classes in java)

Data Structure: is a special format to organize and store group of data. Ex: Arrays, Linked List, Stacks, Queues, Trees, Graphs, files etc)
  1. Linear Data Structures: Elements are accessed sequential order and need not be stored sequential order. Ex: Linked List, Stack, Queue, Array 
  2. Non-Linear Data structures: Elements are stored/accessed in non-linear order. Ex: Trees and Graphs
  
  Abstract Data Types( in Java, they are called Collection Framework under java.util package): these are data structures along with operations(insert, delete, find, count, traverse) to manipulate the data in these data structures. Ex: ArrayList, LinkedList, HashMap, HashTable, HashSet, Priority Queues, 

Array is the most foundational data structure. Array stores the memory address(pointer or reference) in sequential order which is defimed by index. Index 0 - 1010 (data: apple), Index 1 - 1011(data: banana); index 2 - 1012 (data: mango). If you want to read index 2, the computer goes to memory address 1012 in one step (Computer remembers the starting address at index 0; for index 2, it will add 2 to the memory address of index 0, that is 1010+2 =1012) and returns the data -mango. TIme Complexity is O(1); If you search 'mango' and find it's index, yoou need to start comparing the data from index 0. Time complexity for worst case(data in the last in theh last index of the array)= O(n). Inserting a new data at the end of array takes only one step (Computer knows teh starting memory address of the array and also the size of the array. Now it will calcuate the meomory address thta needs to be added as teh last element). To add a new data at the start of the arry taken O(n+1) that means it has to move each element in teh array one step right(total n steps) and add the new value at the start(1 step). Deleting a data takes one step and moving the remaining data to one step left to fill the gap takes n steps. Time Complexity is O(N+1)=O(n).

Set  is an array with one restriction, that is, set should not have duplicate values. Set can be implemented with array or Hashing or Linked List or Tree. Lert us take Array-based Set. Reading, searching and deleting from a set is similar as array. Inserting at the end of the set takes N steps to search and find the value already exists in the set and if not, one step to insert the new data to teh set. N+1 = O(N). Insertig a new data at the beginning of the array is worst-case scenario, as it takes 2N+1 steps(N steps to check if teh new data already exisits pr not in the array,  N steps to shift all the data to the right to create space for new data, 1 step for inserting a new data).

Algorithm is how you perform a particular operation. We can use mulitiple algorithm to a aprticular operation. For example, in an Ordered Array Data structure(in normal array, we add a new data at the end which is the best case, but, in ordered array we add a new data in a appropriate plaxce based on the order(natural order) of the data. So we need to search to find the appropriate place in the array and then move all the data one cell towards right to create a space for new data and inserts the new data). We can use multiple algorithm to search ordered array, one is Linear Search and another one is Binary Search. Please note that we can't do binary search in normal array. =3.Linear search of 10,000 data takes 10,000 steps. Binary search of 10,000 dara takes only 13 steps. Binary search alogorithm increases one step when the data doubles. That means, O(log n). Logarithm is theh inverse of exponents. Exponent is like 2 power 3 which is equal to 2*2*2=8. Now log2(8)=3. Log2(64)=6.
If N=1024, O(N) =1024 and O(log N) = 10.

Sort an array of unordered numbers into ascending order:
Bubble Sort - is a simple, basic sort alogrithm. 
Initially, thw whole array is unsorted. 
 1. Compare first two elements(use two pointers), 
 2. if left>right, swap left with right
 3. move the pointers once cell to the right
 Continue 1 to 3 until end of the array. This is called one pass through. At the end of this pass through, the last element will be sorted(the highes value).
 Now the array which is left of the last element is unsorted.
 Repeat step 1 to 4. This time last but one element and the last element will be sorted. remaining array on the left is unsorted.
 Repeat step 1 to 4 for  n-1 time, where n is the length of the array
 
 4 3 2 1
 First pass through
 3421
 3241
 3214
 second passthrough on 321
 231
 213
 third passthrough on 21
 12
 final output = 1234
 
 the complexity is O(N squared). it is quadratic time.
 There are 2 thigs happening in the algorithm:
 1. Comparison of two elements (3+2+1=6 steps)
 2. Swaps (in worst case scenario where the array is in descending order, the total swaps are same as comparisons. in this case, 6)
 if n=4, total steps are 12; approximately N squared which is 16.

Some other examples  of quadratic problem:
Find if the given array contains duplicate values: there are two approaches. 
  1. Quadratic Solution: First approach we can use two nested FOR loops and compare every element with other element. this is N squared steps
  2. Linear Solution: Second approach, in a single FOR loop, keep track of 'which number it has already encountered' using an array called existingNumnbers[]. Every time the code encounters a new number, it stores i in the index of existingNumbers corresponding to the value of the number. If the array is [3,2,7], existingNumbers[]=[ ,1,1,1, , , ,1]
 3. Linear Solution: in a single for loop, add each data into a HashSet. if the add() method of HashSet returns false, thta means, the rdatais a duplicate. Time complexity is O(N), as adding a value to HashSet is one step O(1) and FOR loop takes O(N) steps.
 
 Selection SOrt: We check each cell of a array to see which value is least and store the index into a variable-lowestValueIndex. Once we reach the end of teharray, we swap the value at the location of lowest index with the first element of the array. In the second passthrough, we check each cell starting from index 1 and find the lowest value index and swap. In the third passthrough, index 2 with lowest index value and son on. 
 
 if N=4; there will be 3+2+1=6 comparisons. and only 3 swaps(one for each passthrough) for worst case scenario(in case of bubble sort, it will be 6 passthrough). Even though, O(N squared), it is faster than Bubble sort.
 
 In Big-O notation, O(n squared/2) = O(N squared); O(100N) = O(N); O(N/2) = O(N)
 
 
