package coreexample1;

public class HelloWorld {

	public static void main(String[] args) {
		String a = "Hello World";
		System.out.println(a);
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.println(a.charAt(i));
		}

	}
}