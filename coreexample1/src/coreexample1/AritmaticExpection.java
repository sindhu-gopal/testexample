package coreexample1;

public class AritmaticExpection {

	public static void main(String[] args) {

		String error = null;
		try {
			int a = 10 / 0;
			String p = "";
			p.equals("");

		} catch (Exception e) {
			if (e instanceof ArithmeticException) {
				System.out.println("can't  divide it");
			}
			if (e instanceof NullPointerException) {
				System.out.println("null pointer expection");
			}

		}

	}

}
