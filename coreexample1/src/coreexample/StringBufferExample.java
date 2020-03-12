package coreexample;

public class StringBufferExample {

	
	

	public static void main(String[] args) {
		StringBuffer fullname = new StringBuffer(" ");
		System.out.println(fullname.hashCode());
		
		 
	    fullname = fullname.append("sindhu");
		System.out.println(fullname + ":" + fullname.hashCode());
		
		fullname = fullname.append("tadapaneni");
		System.out.println(fullname + ":" + fullname.hashCode());

		int indexof = fullname.indexOf("n");
		System.out.println(indexof);
		int lastindexof = fullname.lastIndexOf("n");
		System.out.println(lastindexof);
		String ss = fullname.substring(0,9);
		System.out.println(ss);
		String s = fullname.substring(9);
		System.out.println(s);
		StringBuffer  rev=fullname.reverse();
		System.out.println(rev);
		int cap=fullname.capacity();
		System.out.println(cap);
	    int len=fullname.length();	
	    System.out.println(len);
	    StringBuffer delete=fullname.delete(0, 2);
	    System.out.println(delete);
	}

}
