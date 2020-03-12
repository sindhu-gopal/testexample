package com.rs.oops;

//final class: Cannot allow to derive the behavior to subclass
public abstract class Father {

	//final: Cannot be reinitialized / changed
	public final int credits = 1000000;
	public int debits = 200000;
	
	//abstract: Incomplete behavior
	public abstract float getAmount(int percentage);
	
	//non-abstract method
	//final method cannot be override...
	public final void getAmountToMother() {
		System.out.println("from father");
	}
}
