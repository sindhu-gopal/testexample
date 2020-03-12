package com.rs.oops;

//implements: to derive the behavior from super to sub class.
public class SonImpl implements FatherI, MotherI{

	public static void main(String[] args) {
		
		FatherI fatherI = new SonImpl();
		float amountFromFather = fatherI.getAmountFromFather(60);
		
		MotherI motherI = new SonImpl();
		float amountFromMother = motherI.getAmountFromMother(60);
		
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
