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

Algorithm is how you perform a particular operation. We can use mulitiple algorithm to a aprticular operation. For example, in an Ordered Array Data structure(in normal array, we add a new data at the end which is the best case, but, in ordered array we add a new data in a appropriate plaxce based on the order(natural order) of the data. So we need to search to find the appropriate place in the array and then move all the data one cell towards right to create a space for new data and inserts the new data). We can use multiple algorithm to search ordered array, one is Linear Search and another one is Binary Search. 
Please note that we can't do binary search in normal array. =3.Linear search of 10,000 data takes 10,000 steps. Binary search of 10,000 dara takes only 13 steps. Binary search alogorithm increases one step when the data doubles. That means, O(log n). 
Logarithm is theh inverse of exponents. Exponent is like 2 power 3 which is equal to 2*2*2=8. Now log2(8)=3. Log2(64)=6.
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
 
 if N=4; there will be 3+2+1=6 comparisons. and only 3 swaps(one for each passthrough) for worst case scenario(in case of bubble sort, it will be 6 passthrough). Even though, O(N squared), it is faster than Bubble sort, even though both are O(N squared) as per Big O Notation.
 
 For N=80, Buble sort has 6320 steps. but selection sort has 3239 steps(3160 Comparisons + 79 Swaps)
 
 In Big-O notation, O(n squared/2) = O(N squared); O(100N) = O(N); O(N/2) = O(N)
 
 Till now, we have seen best and worst case scenario. But most of the time, we used to get average case. In that case, we need to choose algorithm that works better in average case. If you look at the bell-curve, frequency of average case will be more. Best and  worst case happens infrequently.
Take an example of Insertion Sort.Some passthroughs compare all the data towards left of the temp_calue, while other passthroughs end early, due to encountering a value that is less than the temp_value. So, It takes O(N) for best case, O(N  squared) for worst case and O(N Squared/2) for average cases.  But Selection sort always takes O(N squared/2) for all the cases(best, worst and average). So Insertion Sort is better than Selection Sort.
Eample: Find the intersection between two arrays
Solution: use two nested loop and compare each cell with other cell value and write the common value into a new result array. All cases , O(N squared)
Optimized Solution: Use two nested loop and compare each cell with other cell, write the common value into a new array, break and come out of inner loop. Best case, it’s O(N), worst case, it’s O(N squared), average case, it’s between O(N ) and O(N squared).
Fast Look-up(search for a specific value) using Hash table, which in the order of O(1) for best, worst and average cases.
Hash table has other names like, maps, hashmaps, dictionaries, associative array.
Hashing is the process of converting character into number. If A=1, B=2, etc., ABC=1+2+3=6. Hash function is the computer code that does this conversion. Another way of hashing is multiplying the value like ABC=1*2*3=6.
A Hash Function needs to meet only one rule: Hash function must convert the same string to the same number every single time when it’s applied. If not, it’s called invalid hash functions. Examples of invalid has functions are function that uses random number or current time as part of their calculation.
Hash table internally stores the data in a bunch of cells in a row, similar to an array. Each cell has a number.
Steps to add a key-value to the hash table: (Hashtable thesaurus = new Hashtable(); h.add(“bad”,”evil”);
1.	Apply hash function to the key (bad=2*1*4=8)
2.	Place the value “evil” into cell 8.
Steps to look up value for key “bad”:
1.	Apply same hash function to the key (bad =2*1*4=8)
2.	Go to cell 8 and retrieve the value “evil”.
If you use unordered array, the look up will take O(N). if you use ordered array, the same look up will take O(log N). But hash table always takes O(1).
Collision in Hash table: Trying to add a data to  cell that’s already filled is called Collision.
Classic approach to solve collision is – ‘Separate Chaining’. When a collision occurs instead of storing the single value of the key in the cell, we need to store the reference to an array that contains key-value pair itself. This array contains sub array that contains key-value pair. 
Add key “dab”. Dab=4*1*2=8. In cell 8, it looks like – Array{subarray1{bad,evil}, subarray2{dab,pat}}
Steps to search “dab” in hash table:
1.	Apply hashing to the key (dab=4+1+2=8)
2.	Look up cell 8. Cell 8 contains array of arrays rather than a single value
3.	Search through the array linearly to search ‘dab’. 
4.	Returns the value of index 1 of the second subarray.
A good hash table strikes a balance between avoiding collisions and not consuming lot of memory.
Thumb rule: to store 7 elements, need to allocate 10 cells. If you plan to store 14 elements in hashtable, you should have 20 cells. This is called load factor 0.7(14/20).
Usage of hash table: if you use array-based set for large set of data, you will have search in O(N) and insertion in O(N). Instead, if you use Hashtable to store the Set, you get insertion in O(1) and search in O(1).
Steps to use Hashtable as set ((Set {“aza”,”dza”}):
Hashtable h = new Hashtable();
h.add(“aza”,1);
h.add(“dza”,1);
h.add(“aza”,1);//since aza is already present. It will overwrite 1 with 1 again.
 Stacks and Queues: they are nothing but array with few restrictions. They are used to handle TEMPORARY DATA in the program. They are used as Temporary containers for data.
Example: 
1.	OS architecture
2.	Printing jobs
3.	Traversing data
4.	Connection pool
In a restaurant, food orders are temporary data meaning, the data is useful until the food is served. After the food is served, we can discard the data. But, since the food needs to be served in an order(first come first served), the order of the data is important. Stacks and queues help to handle data in order and get rid of it once it’s processed.
Stacks store data is a same way as array does. Thre are 3 constraints:
1.	Data should be inserted at the end of array
2.	Data should be read from the end of the array
3.	Data should be removed from the end of the array

Insertion – push ( add a new element at the end of the array)
Deletion – pop (remove the last element of the array)
read the element at the top – peek(read the last element of the array)
Queues are arrays with 3 restrictions:
1.	Data should be inserted at the end of the array
2.	Data should be read from the front of the array
3.	Data should be deleted from the front of the array
Example:
1.	Printing jobs
2.	Handle asynchronous requests(process the requests in the order they are received)
3.	Event handling in the order it occurs
Recursion is an algorithm that depends upon Stacks. Recursion is also a foundation for more advanced algorithms. Recursion Helps to solve tricky problems in simple way.
Recursion: a method calls itself. Wherever we can use loop, we can use recursion.
Example: countdown
Public void countdown(int number){
Sysout(“Print “+number);
Countdown(number-1);
}
Steps:
1.	We call countdown(10) method.
2.	We print ‘10’
3.	Before countdown(10) method is completed, We call countdown(9) 
4.	Countdown(9) begins running. Countdown(9) prints “9”
5.	Before countdown(9) is complete, we call countdown(8).
6.	Countdown(8) is running…..
To break the recursion, we need to add conditional statements. That condition is called base case
Public void countdown(int number){
Sysout(“print “+number);
If (number==0)
Return;
Else {
Countdown(number-1);
}
How to read recursive code?
1.	Identify what the base case is.
2.	Walk through the function assuming the base case
3.	Then, walk through the function assuming the case immediately before base case
4.	Continue your analysis by moving up the cases ONE AT A TIME.

Int factorial(int number){
If (number==1) 
	Return 1;
Else {
Return number*factorial(number-1);
}
}
Steps:
1.	Base case: factorial(1) return 1
2.	Recursive case immediately before base case: factorial(2) return 2
3.	Recursive case before previous case: factorial(3) return 6.
In computer, the following steps happen:
1.	Factorial(3) is called. 
2.	Before factorial(3) is getting completed, it calls factorial(2). 
3.	Computer pushes the factorial(3) information to the CALL STACK.
4.	The computer proceeds to execute factorial(2).
5.	Before factorial(2) is completed, it calls factorial(1)
6.	Computer pushes  factorial(2) information to CALL STACK
7.	The computer procceds to execute factorial(1).
8.	Since this is the base case, computer completes factorial(1) execution and returns 1.
9.	Computer peeks at the CALL STACK. Factorial(2) is the last item kept in the callstack. It pops out factorial(2) and completes it’s execution.
10.	Computer peeks at the callstack again and finds factorial(3) and completes it’s execution.
11.	Now, the call stack is empty.
Countdown and factorial can be solved with LOOPS too. But it’s useful if you repeat the same algorithm inside the same algorithm. 
Example : print all sub-directories names within a given directory: here we can’t use for loop, as it would go only one level deep. If we want to go all subdirectory levels, we can’t use for loop.
	public static void printSubDirectories(File file) {
		
		for (File str :file.listFiles()) {
			if (str.isDirectory()) {
				System.out.println(str.getPath());
				printSubDirectories(str);
			}
		}
	}

