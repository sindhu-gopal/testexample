package com.rs.oops;

//extends: To derive the behavior from parent to child class.
public class Daughter extends Father{

	public static void main(String[] args) {

		Father father = new Daughter();
		
		float amountToDaughter = father.getAmount(40);
		System.out.println("amountToDaughter: "+amountToDaughter);
		
	}

	//Runtime polymorphism / method overriding:
	//More than one method with same name, parameters can perform different tasks
	//and these methods should be in super and sub classes.
	
	//super: to refer/access the super class properties and methods
	@Override
	public float getAmount(int percentage) {
		return (super.credits - super.debits) * percentage / 100;
	}

}
