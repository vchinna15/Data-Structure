package com.java.datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataStruct <T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("venkat");
		queue.add("hja");
		queue.add("kajd");
		System.out.println(queue.peek());
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.element());
		queue.forEach(name -> {System.out.println(name);});
		
		BlockingQueue<String> bq = new ArrayBlockingQueue<String>(5);
		bq.add("new");
		System.out.println(bq);
		
		//set
		Set <String> set = new HashSet<String>();
			set.add("venkat");
		set.add("Ram");
		System.out.println(set);
		
		Set <String> lSet = new LinkedHashSet<String>(set) ;
		System.out.println(lSet);
		
		set =  new TreeSet<String>(set);
		System.out.println(set);
		
		
	
	DataStruct<String> ds =new DataStruct<>();
	ds.display("venkat");
	
	DataStruct<Integer> ds1 = new DataStruct<>();
	ds1.display(287328);
	
	

}
	void display (T element) {
		System.out.println("print generics"+element);
	}
}
