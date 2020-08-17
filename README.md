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
