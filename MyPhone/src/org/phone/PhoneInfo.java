package org.phone;



public class PhoneInfo {
	private void PhoneName() {
		System.out.println("Iqoo Z9 Pro");
	}
	private void PhoneMieiPhone() {
		System.out.println("123456778");
	}
	private void Camera() {
		System.out.println("lED");
	}
	private void storage() {
		System.out.println("16GB");
		

	}
	private void osName() {
		System.out.println("Andriod");
		

	}
	public static void main(String[] args) {
		PhoneInfo a=new PhoneInfo ();
		a.Camera();
		a.PhoneName();
		a.storage();
		a.PhoneMieiPhone();
		a.osName();
	}

}
