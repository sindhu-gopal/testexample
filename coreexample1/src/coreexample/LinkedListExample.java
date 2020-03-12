package coreexample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> southstates = new LinkedList<String>();

		southstates.add(0, "AP");
		southstates.add("TS");
		southstates.add("TN");
		southstates.add("KA");
		southstates.add("KR");
		southstates.add("AP");

		LinkedList<String> northstates = new LinkedList<String>();

		northstates.add("MR");
		northstates.add(0, "DL");
		northstates.add("PB");
		northstates.add(null);
		northstates.add("HA");
		northstates.add("OD");

		LinkedList<String> indiastates = new LinkedList();

		indiastates.addAll(southstates);
		indiastates.addAll(northstates);

		String statecode = null;
		Iterator<String> iterator = indiastates.iterator();
		while (iterator.hasNext()) {
			statecode = iterator.next();
			System.out.println(statecode);
		}
		System.out.println(indiastates.size());
		List<String> indiastatescopy = indiastates;
		indiastatescopy.add("deep");

		List<String> indiastaesclone = (List<String>) indiastates.clone();
		indiastaesclone.add("shallow");
		indiastates.element();
		indiastates.getFirst();
		indiastates.getLast();
		indiastates.peek();
		//it returns first element of a list
		indiastates.peekFirst();
		//it returns first element of a list or return null if list is empty
		indiastates.pollFirst();
		//it remove first element of a list or return null if list is empty
		indiastates.poll();//

		System.out.println(indiastates.contains("TS"));
		System.out.println(indiastates.contains("TR"));
		indiastates.addFirst("AP");
		indiastates.addLast("AP");
		System.out.println(indiastates.containsAll(southstates));
		System.out.println(indiastates.subList(0, 5));
		System.out.println(indiastates.get(5));
		System.out.println(indiastates.indexOf("TN"));
		System.out.println(indiastates.lastIndexOf("AP"));
		System.out.println(indiastates.remove(3));
		System.out.println(indiastates.set(1, "KA"));
		indiastates.clear();

	}

}
