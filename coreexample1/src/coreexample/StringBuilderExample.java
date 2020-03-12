package coreexample;

public class StringBuilderExample {

	
	public static void main(String[] args) {
		StringBuilder fullname = new StringBuilder(" ");
		System.out.println(fullname.hashCode());

		fullname = fullname.append("sindhu");
		System.out.println(fullname + ":" + fullname.hashCode());

		fullname = fullname.append("tadapaneni");
		System.out.println(fullname + ":" + fullname.hashCode());

		StringBuilder in = fullname.insert(2, " r");
		System.out.println(in);

		StringBuilder rev = fullname.reverse();
		System.out.println(rev);

		StringBuilder replace = fullname.replace(5, 7, "dhi");
		System.out.println(replace);

		StringBuilder delete = fullname.delete(0, 2);
		System.out.println(delete);

		String s = fullname.substring(5);
		System.out.println(s);

		int cap = fullname.capacity();
		System.out.println(cap);

	}

}
