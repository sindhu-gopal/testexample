package coreexample;


public class Daughter extends Father {
	public static void main(String[] args) {
		Father father = new Daughter();
		float daughtersamount = father.getmoney(20);
		System.out.println("DaughterAmount:" + daughtersamount);
	}

	@Override 
	public float getmoney(int percentage) {
		return (super.credits - super.debits) * percentage / 100;

	}

	@Override
	float getFromGrandFather(int percentage) {
		return (super.credits - super.debits) * percentage / 100;
	}

	
	

}

