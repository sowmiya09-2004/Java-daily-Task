package org.abstraction;

public  class FullyPasss implements FullyC {

	public void stdname(String name) {
	 System.out.println("the student Name is "+name);
		
	}

	public void stdId(int id) {
		System.out.println("the student Id  is "+id);
		
	}

	public void stdGender(String gender) {
		System.out.println("the student gender is "+gender);
		
	}
	public static void main(String[] args) {
		FullyPasss a=new FullyPasss();
		a.stdGender("Female");
		a.stdId(1234);
		a.stdname("bheem");
	}

}