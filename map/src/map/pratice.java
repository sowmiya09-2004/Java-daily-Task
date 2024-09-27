package map;

import java.util.*;
import java.util.Map.Entry;

public class pratice {
	public static void main(String[] args) {
		Map <String,Integer>w=new HashMap();
		
		//random value
		w.put("a", 45);
		w.put("b", 46);
		w.put("c", 47);
		w.put("d", 48);
		w.put("e", 49);
		w.put("h", null);
		w.put(null, 45);
		System.out.println(w);
//		
		//linkedhashmap
//		Map <String,Integer>w=new LinkedHashMap();
//		w.put("a", 45);
//		w.put("b", 46);
//		w.put("c", 47);
//		w.put("d", 48);
//		w.put("e", 49);
//		w.put("h", null);
//		w.put(null, 45);
//		System.out.println(w);
//		
		
		//treemap
//		Map <String,Integer>w=new TreeMap();
//		w.put("a", 45);
//		w.put("b", 46);
//		w.put("c", 47);
//		w.put("d", 48);
//		w.put("e", 49);
//		w.put("h", null);
//		w.put(null, 45);
//		System.out.println(w);
//		
		
//		//hashtable
//		Map <String,Integer>w=new Hashtable();
//		w.put("a", 45);
//		w.put("b", 46);
//		w.put("c", 47);
//		w.put("d", 48);
//		w.put("e", 49);
////		w.put("h", null);
////		w.put(null, 45);
//		System.out.println(w);
//		
		
		
		
//		int f = w.size();
//		System.out.println(f);
//		
//		boolean containsKey = w.containsKey("b");
//		System.out.println(w);
//		
//		
//		boolean containsValue = w.containsValue(46);
//		System.out.println(w);
//		
//		
//		Integer remove = w.remove("e");
//		System.out.println(remove);
//		
//		Set<String> keySet = w.keySet();
//		System.out.println(keySet);
//		
//		Collection<Integer> r = w.values();
//		System.out.println(r);
//		
		
		Set<Entry<String, Integer>> entrySet = w.entrySet();
		for  (Entry<String, Integer> y:entrySet) {
			System.out.println(y);
			System.out.println(y.getKey());
			System.out.println(y.getValue());
		}
		
		
		
		
			
		        
		
		
		
		
		
		
		
		
	}

}
