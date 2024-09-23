package org.multilevel;

public class child extends parent {
	private void childId() {
	System.out.println("999099");
	}
	private void childName() {
		System.out.println("Child");

	}
	public static void main(String[] args) {
		child a=new child();
		a.childId();
		a.childName();
		a.parentId();
		a.parentName();
		a.grandId();
		a.grandName();
	}

}
