package coreexample;

import java.util.Comparator;




public class EmpNameComparator implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 empname, Emp1 otherename) {
		if (empname.name.compareTo(otherename.name) > 0) {
			return 1;
		} else if (empname.name.compareTo(otherename.name) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	

}
