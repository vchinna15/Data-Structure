package com.datastructure;

import java.security.cert.CollectionCertStoreParameters;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class JavaListSetStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[3];
		array[0]=1023;
		array[1]=768;
		int[][] matrix = new int[10][10];
		
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		//Doubly-linked list implementation of the List and Deque interfaces. Implements 
		//all optional list operations, and permits all elements (including null). 

		//All of the operations perform as could be expected for a doubly-linked list. 
		//Operations that index into the list will traverse the list from the beginning or 
		//the end, whichever is closer to the specified index. 
		List<Object> list = new LinkedList<Object>();
		//Appends the specified element to the end of this list 
		list.add(new Integer(1000));
		list.add(new Integer(20));
		list.add(new Integer(42));
		System.out.println(list.get(1));
		System.out.println(list.set(1, 300));
		System.out.println(list.get(1));
		System.out.println(list.size());
		list.add(1, 2300);
		System.out.println(list.size());
		list.sort(null);;
		System.out.println(list.get(0));
		//Resizable-array implementation of the List interface. Implements all optional 
		//list operations, and permits all elements, including null. In addition to 
		//implementing the List interface, this class provides methods to manipulate the 
		//size of the array that is used internally to store the list. 
		//(This class is roughly equivalent to Vector, except that it is unsynchronized.) 

		//The size, isEmpty, get, set, iterator, and listIterator operations run in 
		//constant time. The add operation runs in amortized constant time, that is, 
		//adding n elements requires O(n) time. All of the other operations run in 
		//linear time (roughly speaking). The constant factor is low compared to that 
		//for the LinkedList implementation. 

		//Each ArrayList instance has a capacity. The capacity is the size of the array 
		//used to store the elements in the list. It is always at least as large as the 
		//list size. As elements are added to an ArrayList, its capacity grows automatically. 
		
		/*
		 * private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
		 * transient Object[] elementData; 
		 *     public ArrayList() {
       		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        } */
    
		List l =  new ArrayList();
		l.add("ram");
		l.sort(null);
		List l1 = new AbstractList<String>() {

			@Override
			public String get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		//This class provides a skeletal implementation of the List interface to minimize 
		//the effort required to implement this interface backed by a "sequential access" data store 
		//(such as a linked list). For random access data (such as an array), AbstractList 
		//should be used in preference to this class.

		//This class is the opposite of the AbstractList class in the sense that it 
		//implements the "random access" methods (get(int index), set(int index, E element),
		//add(int index, E element) and remove(int index)) on top of the list's 
		//list iterator, instead of the other way around.

		//To implement a list the programmer needs only to extend this class and provide 
		//implementations for the listIterator and size methods. For an unmodifiable 
		//list, the programmer need only implement the list iterator's hasNext, next,
		//hasPrevious, previous and index methods.

		//For a modifiable list the programmer should additionally implement the 
		//list iterator's set method. For a variable-size list the programmer should 
		//additionally implement the list iterator's remove and add methods.

		//The programmer should generally provide a void (no argument) and collection 
		//constructor, as per the recommendation in the Collection interface specification.

		List seqList = new AbstractSequentialList<Integer>() {

			@Override
			public ListIterator<Integer> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		//l1.add("venkat");
		System.out.println(l1.get(0));
		
		ListIterator lI =l.listIterator();
		lI.add("iterate");
		Iterator iter = l.iterator();
		iter.next();
		Spliterator sl = l.spliterator();
		System.out.println("spliterator="+sl.characteristics());
		
		//Constructs an empty vector so that its internal data array has size 10 and its standard 
		//capacity increment is zero.
		/*     public Vector(int initialCapacity, int capacityIncrement) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        this.elementData = new Object[initialCapacity];
        this.capacityIncrement = capacityIncrement;
    }
    */
		Vector v = new Vector();
		v.add(123);
		
		//The Stack class represents a last-in-first-out (LIFO) stack of objects. It 
		//extends class Vector with five operations that allow a vector to be treated as 
		//a stack. The usual push and pop operations are provided, as well as a method to 
		//peek at the top item on the stack, a method to test for whether the stack is 
		//empty, and a method to search the stack for an item and discover how far it is 
		//from the top. 

		//When a stack is first created, it contains no items. 

		//A more complete and consistent set of LIFO stack operations is provided by the 
		//Deque interface and its implementations, which should be used in preference to 
		//this class  -- Deque stack = new ArrayDeque()
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(230);
		stack.add(450);
		System.out.println("stack peek="+stack.peek());
		stack.push(670);
		System.out.println("stack peek="+stack.peek());
		System.out.println("stack pop="+stack.pop()+"  stack Size"+stack.size());
		
		//This class implements the Set interface, backed by a hash table (actually a 
		//HashMap instance). It makes no guarantees as to the iteration order of the set; 
		//in particular, it does not guarantee that the order will remain constant over time.
		//This class permits the null element.
		Set<Integer> set = new HashSet<Integer>();
		//Adds the specified element to this set if it is not already present (optional operation). 
		//More formally, adds the specified element e to this set if the set contains no 
		//element e2 such that (e==null ? e2==null : e.equals(e2)). If this set already 
		//contains the element, the call leaves the set unchanged and returns false.
		set. add(289);
		set.add(289);
		System.out.println(set.size());
		set.remove(289);
		System.out.println(set.size());
		set.iterator();
		//Hash table and linked list implementation of the Set interface, with predictable 
		//iteration order. This implementation differs from HashSet in that it maintains 
		//a doubly-linked list running through all of its entries. This linked list 
		//defines the iteration ordering, which is the order in which elements were 
		//inserted into the set (insertion-order). 
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		System.out.println(set1.size());
		set1.add(8989);
		set1.add(null);
		Iterator i =  set1.iterator();
		Spliterator SP2ET = set1.spliterator();
		//A NavigableSet implementation based on a TreeMap. The elements are ordered using 
		//their natural ordering, or by a Comparator provided at set creation time, 
		//depending on which constructor is used. 

		//This implementation provides guaranteed log(n) time cost for the basic operations 
		//(add, remove and contains).
		//TreeSet implements NavigableSet->SortedSert->Set interfaces
		Set<Integer> setT = new TreeSet<Integer>();
		//setT.add(null); NullPointerException		
	}

}
