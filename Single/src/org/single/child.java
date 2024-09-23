package org.single;

public class child extends parent {
	private void childId() {
		System.out.println("childid is 12345");
		

	}
	private void childName() {
		System.out.println("chintu");
	}
	public static void main(String[] args) {
		child a=new child();
		a.childId();
		a.childName();
		a.parentName();
		a.parentId();
	}

}
