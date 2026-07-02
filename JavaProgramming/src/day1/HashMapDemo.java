package day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//Map<Integer,String> hm=new HashMap<Integer,String>();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "Raju");
		hm.put(102, "Kumar");
		hm.put(103, "Murthy");
		hm.put(101, "Hari");
		System.out.println(hm);
		hm.remove(102);
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		//for each
		for(int k:hm.keySet()) {
			System.out.println(k+"  "+hm.get(k));
		}
		//Using Iterator
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,String>en=it.next();
			System.out.println(en.getKey()+"  "+en.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
		
	}
	

}
