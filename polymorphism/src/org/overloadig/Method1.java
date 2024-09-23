package org.overloadig;

public class Method1 {
	private void empdetails(String name) {
		System.out.println("the employee name is:"+name);

	}
	private void empdetails(int age) {
		System.out.println("the employee age is:"+age);

	}
	public static void main(String[] args) {
		Method1 a=new Method1();
		a.empdetails(23);
		a.empdetails("bheem");
		a.empdetails(78);
		a.empdetails("hattori");
		a.empdetails(24);
		a.empdetails("tom");
		}
}
