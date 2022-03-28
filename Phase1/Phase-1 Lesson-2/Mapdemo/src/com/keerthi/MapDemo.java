package com.keerthi;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// map
			//HashMap
				HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
				hm.put(1,"Tina"); 
				hm.put(2,"Maya"); 
				hm.put(3,"Cathy"); 
			 
				System.out.println("\nThe elements of Hashmap are "); 
				for(Map.Entry m:hm.entrySet()){ 
				System.out.println(m.getKey()+" "+m.getValue()); 
			 }
			 
				//HashTable
			 
				 Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
				 
				 ht.put(4,"Alia"); 
				 ht.put(5,"Rocky"); 
				 ht.put(6,"Jackie"); 
				 ht.put(7,"Johnny"); 
				 System.out.println("\nThe elements of HashTable are "); 
				 for(Map.Entry n:ht.entrySet()){ 
				 System.out.println(n.getKey()+" "+n.getValue()); 
			 }
			 
			 
				 //TreeMap
			 
				 TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
				 map.put(8,"Ann"); 
				 map.put(9,"Costa"); 
				 map.put(10,"Catie"); 
			 
				 System.out.println("\nThe elements of TreeMap are "); 
				 for(Map.Entry l:map.entrySet()){ 
				 System.out.println(l.getKey()+" "+l.getValue()); 
			 } 
			 

	}

}
