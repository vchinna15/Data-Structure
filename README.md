# Data-Structure

Variable

Data Type
  1. System Defined Data types(Primitive Data types: int, float etc..)
  2. User defined data types (classes in java)

Data Structure: is a special format to organize and store group of data. Ex: Arrays, Linked List, Stacks, Queues, Trees, Graphs, files etc)
  1. Linear Data Structures: Elements are accessed sequential order and need not be stored sequential order. Ex: Linked List, Stack, Queue, Array 
  2. Non-Linear Data structures: Elements are stored/accessed in non-linear order. Ex: Trees and Graphs
  
  Abstract Data Types( in Java, they are called Collection Framework under java.util package): these are data structures along with operations(insert, delete, find, count, traverse) to manipulate the data in these data structures. Ex: ArrayList, LinkedList, HashMap, HashTable, HashSet, Priority Queues, 

Array is the most foundational data structure. Array stores the memory address(pointer or reference) in sequential order which is defimed by index. Index 0 - 1010 (data: apple), Index 1 - 1011(data: banana); index 2 - 1012 (data: mango). If you want to read index 2, the computer goes to memory address 1012 in one step (Computer remembers the starting address at index 0; for index 2, it will add 2 to the memory address of index 0, that is 1010+2 =1012) and returns the data -mango. TIme Complexity is O(1); If you search 'mango' and find it's index, yoou need to start comparing the data from index 0. Time complexity for worst case(data in the last in theh last index of the array)= O(n). 
