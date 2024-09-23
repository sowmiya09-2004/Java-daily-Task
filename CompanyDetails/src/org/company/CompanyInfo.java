package org.company;

public class CompanyInfo {
	private void companyId() {
		System.out.println("companyId is 1234");
	}
	private void companyName() {
		System.out.println("abc company");
	}
	private void companyAddress() {
		System.out.println("chennai");
	}
	public static void main(String[]args) {
		CompanyInfo b = new CompanyInfo();
		b.companyId();
		b.companyAddress();
		b.companyName();
		
	}
	

}
