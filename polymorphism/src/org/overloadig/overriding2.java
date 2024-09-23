package org.overloadig;

public class overriding2 extends overriding1 {
	public void taxlimit(int tax) {
	System.out.println("the newtax is :"+tax);
	super.taxlimit(45000);//super keyword directly call the next class /


	}
	public static void main(String[] args) {
		overriding2 v=new overriding2();
		v.taxlimit(500000);
	}
	

}
