package coreexample;

public class WrapperClass {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("Abc");
		System.out.println(s1.hashCode() + "and" + s2.hashCode());
		if (s1 == s2) {
			System.out.println("the object hash references are same");
		}
		if (s1.equals(s2)) {
			System.out.println("the object values are same which is case senstive");
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("the object value are same which is case in_sensetive");
		}
		String fullname = "";
		boolean isempty = fullname.isEmpty();
		System.out.println(fullname.hashCode());
		fullname = fullname + "SindhuSrilakshmi";
		System.out.println(fullname + ":" + fullname.hashCode());
		fullname += " ";
		System.out.println(fullname + ":" + fullname.hashCode());
		fullname += "tadapaneni";
		System.out.println(fullname + ":" + fullname.hashCode());
		char character = ' ';
		for (int index = 0; index < fullname.length(); index++) {
			character = fullname.charAt(index);
			System.out.println(character);
		}
		int indexof = fullname.indexOf('m');
		int lastindexof = fullname.lastIndexOf('m');
		fullname = fullname.replace(" ", ",");
		fullname = fullname.concat(" ");
		boolean contains = fullname.contains("l");
		boolean startswith = fullname.startsWith("sindhu");
		boolean endswith = fullname.endsWith("tadapaneni");
		String substring = fullname.substring(0, 9);
		String ss = fullname.substring(9);
		String[] fullnamearr = fullname.split(",");
		String s = fullname.toUpperCase();
		String fullnameuc = fullname.toLowerCase();
		int compareto = fullname.compareTo("sri");
		System.out.println(compareto);
		String replace = fullname.replaceAll("a", "e");
		System.out.println(replace);
		String s3 = s2.intern();
		if (s1 == s3) {
			System.out.println("hii");
		}
			
			
			System.out.println("for loop");
			String name = "nani tadapaneni";
            
			for (int index = name.length()-1; index > -1; index--) {

				char character1 = name.charAt(index);

				System.out.println(character1);
			}
	}

}
