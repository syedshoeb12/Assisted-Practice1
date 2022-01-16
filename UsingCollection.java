package com.phase1;
import java.util.*;
public class UsingCollection {

	public static void main(String[] args) {
		//creating set
		System.out.println("creating set");
		int count[]= {21,23,43,53,22,65};
		Set<Integer>set=new HashSet<Integer>();
		try {
			for(int i=0;i<=5;i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			TreeSet<Integer>sortedset=new TreeSet<Integer>(set);
			System.out.println("the sorted list");
			System.out.println(sortedset);
		}catch(Exception e) {
			
		}
			//creating list
		System.out.println();
			System.out.println("creating list");
			List<String>list=new ArrayList<String>();
			list.add("Syed");
			list.add("Shoeb");
			for(String student:list)
				System.out.println(student);
			
			//creating queue
			System.out.println();
			System.out.println("creating queue");
			Queue<String>queue=new LinkedList< >();
			queue.add("Apple");
			queue.add("Mango");
			queue.remove("Mango");
			System.out.println(queue);
			
	

				//creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("Bangalore");//
			      city.add("Delhi");    	   
			      System.out.println(city);  
				
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(15); 
			      vec.addElement(30); 
			      System.out.println(vec);
				
				//creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Alex");  
			      names.add("John");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> Set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	 
			      }  
		
	}

}
