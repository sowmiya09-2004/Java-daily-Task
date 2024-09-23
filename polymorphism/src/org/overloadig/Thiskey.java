package org.overloadig;

public class Thiskey {
	private void empdetails(String name) {
		System.out.println("the employee name is:"+name);
		this.empdetails(45);

	}
	private void empdetails(int age  ) {
		System.out.println("the employee age is:"+age);
		
	}
	public static void main(String[] args) {
		Thiskey a=new 	Thiskey();
	a.empdetails("lusu");
		
}
}
