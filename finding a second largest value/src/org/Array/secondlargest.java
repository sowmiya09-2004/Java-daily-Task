package org.Array;
import java.util.Scanner;

public class secondlargest {
	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    	
    }
    int m=a[0];
    for (int i=0;i<a.length;i++) {
         if (a[i]>m)
   {
	   m=a[i]; 
   }
    }
    int m2=a[0];
    m2=(m>a[0])?a[0]:a[1];
    for (int i=0;i<a.length;i++) {
         if (a[i]!=m){
        	 if (a[i]>m2) {
        		 m2=a[i];
        	 }
         }
  
    	
 	
    
	}   
    System.out.println(m2);
	}
}
