package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class pratice {
public static void main(String[] args) {
//	random
	Set li=new HashSet(7);
	li.add(34);
	li.add("chintu");
	li.add('m');
	li.add(123.78f);
	li.add(true);
	li.add(34);
	System.out.println(li);
	
//	insertion order
	Set a=new LinkedHashSet(7);
	a.add(34);
	a.add("chintu");
	a.add('m');
	a.add(123.78f);
	a.add(true);
	a.add(34);
	System.out.println(a);
	
	
	
//	ascending order
	Set b=new TreeSet();
	b.add(34);
	b.add(56);
	b.add(78);
	b.add(123);
	b.add(567);
	b.add(90);
	System.out.println(b);
	
	
	 int y = a.size();
	 System.out.println(y);
	 
	 boolean add = a.add("sowmiya");
	 System.out.println(add);
	 System.out.println(a);
	 
	 
	 boolean remove = b.remove(90);
	 System.out.println(remove);
	 
	 boolean contains = b.contains(568);
	 System.out.println(contains );
	 
	 boolean addAll = a.addAll(li);
	 System.out.println(addAll);
	 
	 
	 for(Object n:b) {
		 System.out.println(n);
	 }
}
}

