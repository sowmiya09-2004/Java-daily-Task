package org.base;
//child
public class Employee {
	private void EmpId() {
		System.out.println("1245");
	
	}
	private void empName() {
		System.out.println("abc");
	
	}
	public static void main(String[] args) {
		Employee a= new Employee();
		a.empName();
		a.EmpId();
		
		Company b=new Company();
		b.comId();
		b.comName();
		
	}

}
