package coreexample;

public class Child extends Parent {

	public static void main(String[] args) {
		Parent parent = new Child();
		float fromparent = parent.getFromGrandFather(60);
		System.out.println("FromParent:" + fromparent);
		float grandfather = parent.getparent(60);
		System.out.println("grandfather:" + grandfather);

	}

	@Override
	float getparent(int percentage) {
		return (super.creditsp - super.debitsp) * percentage / 100;

	}

	@Override
	float getFromGrandFather(int percentage) {
		// TODO Auto-generated method stub
		return (super.credits - super.debits) * percentage / 100;

	}

}
