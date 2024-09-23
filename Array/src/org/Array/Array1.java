package org.Array;

public class Array1 {
	public static void main(String[] args) {
		int a[]=new int[6];
		
		a[0]=12;
		a[1]=52;
		a[2]=62;
		a[4]=82;
		a[5]=92;
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int b:a) {
			System.out.println(b);
		}
	}

}
