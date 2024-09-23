package org.Array;
public class Array2 {
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][0]=12;
		a[0][1]=52;
		a[1][1]=62;
		a[1][0]=82;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for (int []b:a) {
			for(int c:b) {
		System.out.println(c);
				
			}
		
		}
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
				
			}
			
		}
	}
}


