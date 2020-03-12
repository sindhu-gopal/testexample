package coreexample;

public class Son extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public float getmoney(int percentage) {
		return (super.credits - super.debits) * percentage / 100;
	}

	@Override
	  public float getFromGrandFather(int percentage) {
	    return (super.credits - super.debits) * percentage / 100;
		
	}

}
