package coreexample;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtableexample {

	public static void main(String[] args) {
		Map<String, String> states = new Hashtable<String, String>();
		states.put("AP", "AndhraPradesh");
		states.put("TN", "TamilNadu");
		states.put("TS", "Telagana");
		states.put("KA", "Karanataka");
		states.put("MR", "MaharRasta");
		states.put("OD", "Odisa");
		// states.put("KEY", null);
		// states.put(null, "value");
		// states.put(null, null);

		Set<String> keyset = states.keySet();

		Iterator<String> iterator = keyset.iterator();
		String statecode = null;
		String statedesc = null;

		while (iterator.hasNext()) {
			statecode = iterator.next();
			statedesc = states.get(statecode);
			System.out.println("statecode:  " + statecode + " statedesc:  " + statedesc);
		}
		System.out.println(states.replace("OD", "orisa"));
		System.out.println(states.size());
		System.out.println(states.containsKey("MR"));
		System.out.println(states.containsValue("AndhraPradesh"));
		// System.out.println(states.replace("KEY", null, "Kerala"));

	}

}
