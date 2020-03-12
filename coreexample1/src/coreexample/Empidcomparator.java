package coreexample;

import java.util.Comparator;



public class Empidcomparator  implements Comparator<Emp1>{
	

	

	@Override
	public int compare(Emp1 empid, Emp1 otherid) {
		if (empid.id > otherid.id) {
			return 1;
		} else if (empid.id < otherid.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
