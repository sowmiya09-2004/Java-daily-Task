package org.overloadig;

public class argument {
	private void empdetails(String name,int n) {//argument depends on count
		System.out.println("the employee name is:"+name+"/n"+"the employee score is:"+n);

	}
	private void empdetails(int age,String a) {
		System.out.println("the employee age is:"+age+"/n"+"the nick name:"+a);
		
	}
	public static void main(String[] args) {
		argument a=new 	argument();
		a.empdetails(23,"lusu");
		a.empdetails("bheem",45);
	}
}
