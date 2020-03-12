package com.rs.oops;

//extends: To derive the behavior from parent to child class.
public class Son extends Father{

	public static void main(String[] args) {

		Father father = new Son();
		
		float amountToSon = father.getAmount(60);
		System.out.println("amountToSon: "+amountToSon);
		
	}

	//super: to refer/access the super class properties and methods
	@Override
	public float getAmount(int percentage) {
		//super.credits = 1800000;
		return (super.credits - super.debits) * percentage / 100;
	}
	
}
