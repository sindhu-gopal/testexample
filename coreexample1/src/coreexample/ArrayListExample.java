package coreexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> southstate = new ArrayList<String>();
		southstate.add("ANDHRA PRADESH");
		southstate.add("TELANGANA");
		southstate.add("TAIML NADU");
		southstate.add("KARNATAKA");
		southstate.add("CERALA");
		ArrayList<String> northstate = new ArrayList<String>();
		northstate.add("MR");
		northstate.add("DL");
		northstate.add(null);
		northstate.add("PB");

		ArrayList<String> indiastate = new ArrayList<String>();

		indiastate.addAll(southstate);
		indiastate.addAll(northstate);

		Iterator<String> iterator = indiastate.iterator();
		String code = null;
		while (iterator.hasNext()) {
			code = iterator.next();
			System.out.println("Statecode=" + code);
		}
		 List<String >indiastateclone =(List<String>) indiastate.clone();
		 List<String >indiastatecopy =indiastate;
		 
		int size = indiastate.size();
		System.out.println("size " + size);
		int hashcode = indiastate.hashCode();
		System.out.println(hashcode);
		 int index = indiastate.indexOf("AP");
	   System.out.println(index);
	   boolean contains= indiastate.contains("AP");
	   System.out.println(contains);
	   System.out.println("set "+indiastate.set(8, "job"));
	   System.out.println("get "+indiastate.get(8));
	   System.out.println(indiastate.isEmpty());
	   System.out.println(indiastate.lastIndexOf("PB"));
	   System.out.println( indiastate.remove(2));
	   System.out.println(indiastate.toString());
	   

	}

}
