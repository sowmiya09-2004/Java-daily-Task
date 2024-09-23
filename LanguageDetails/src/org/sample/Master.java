package org.sample;

import org.lang.StateDetails;

public class Master {
	private void masterId() {
		System.out.println("Masterid is 123445");


	}
	private void masterName() {
	  System.out.println("Master Name is ABC");

	}
	public static void main(String[] args) {
		Master a= new Master();
		a.masterId();
		a.masterName();
		
		StateDetails b=new StateDetails();
		b.NorthIndia();
		b.SouthIndia();       
	}	 
}
