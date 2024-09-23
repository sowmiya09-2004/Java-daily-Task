package org.emp;

public class Employee {
	private void empId() {
		System.out.println("1234");
	}
	private void empName() {
		System.out.println("chintu");
	}
	private void empDob() {
		System.out.println("09-06-2004");
	}
	private void empPhone() {
		System.out.println("1234567890");
	}
	private void empEmail() {
		System.out.println("abc@gmail.com");
	}
	private void empAddress() {
		System.out.println("abc");
	}
	public static void main(String[]args) {
		Employee a=new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
		
		
		
	}

}
