package coreexample;


public class Sonimpl implements Fatheri, Mother1{

	private static final String FatherI = null;

	public static void main(String[] args) {
		Fatheri Father = new Sonimpl();
		float fromfather = Father.getFather(60);

		Mother1 Mother = new Sonimpl();
		float frommother = Mother.getMother(60);

		System.out.println("FromFather:" + fromfather);
		System.out.println("FromMother:" + frommother);

	}

	@Override
	public float getMother(int percentage) {
		// TODO Auto-generated method stub
		return (Mother1.credits - Mother1.debits) * percentage / 100;
	}

	@Override
	public float getFather(int percentage) {
		// TODO Auto-generated method stub
		return (Fatheri.credits - Fatheri.debits) * percentage / 100;
	}
	}



