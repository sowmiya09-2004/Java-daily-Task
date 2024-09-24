package org.task;

import java.util.ArrayList;
import java.util.List;

public class Company {
  public static void main(String[] args) {
	List li=new ArrayList(5);
	li.add(34);
	li.add("chintu");
	li.add('m');
	li.add(123.78f);
	li.add(true);
	System.out.println(li);
	
	for (int i = 0; i<=4 ; i++) {
		Object object = li.get(i);
		System.out.println(object);
		
	}
	
	
}
}
