package com.rs.oops;

//implements: to derive the behavior from super to sub class.
public class DughterImpl implements FatherI, MotherI{

	public static void main(String[] args) {
		
		FatherI fatherI = new DughterImpl();
		float amountFromFather = fatherI.getAmountFromFather(40);
		
		MotherI motherI = new DughterImpl();
		float amountFromMother = motherI.getAmountFromMother(40);
		
		System.out.println("amountFromFather: "+amountFromFather);
		System.out.println("amountFromMother: "+amountFromMother);
	}

	@Override
	public float getAmountFromMother(int percentage) {
		return (MotherI.credits - MotherI.debits) * percentage / 100;
	}

	@Override
	public float getAmountFromFather(int percentage) {
		return (FatherI.credits - FatherI.debits) * percentage / 100;
	}

}
