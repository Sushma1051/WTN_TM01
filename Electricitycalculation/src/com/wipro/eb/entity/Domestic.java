package com.wipro.eb.entity;


public class Domestic extends Connection{

	public Domestic(int currentReading, int previousReading, float[] slabs){
	super(currentReading, currentReading, slabs);
	}

	@Override
	public float computeBill() {
		int units = currentReading - previousReading;
		float bill =0;
		if(units<=50)
			bill=slabs[0]*units;
		        else if(units>50 && units<=100) 
			bill=slabs[0]*50 + slabs[1]*(units-50);
		else
			bill = slabs[0]*50 + slabs[1]*50 + slabs[2]*(units-100);
	
	return bill;
	}
	
}
