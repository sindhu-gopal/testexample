package coreexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EmpMain {

	public static void main(String[] args) {
		List<Emp1> employees = new ArrayList<Emp1>();

		employees.add(new Emp1(3, "malleswari"));
		employees.add(new Emp1(5, "sindhu"));
		employees.add(new Emp1(1, "malli"));
		employees.add(new Emp1(6, "chandana"));
		employees.add(new Emp1(2, "sri"));

		Collections.sort(employees, new Empidcomparator());

		Iterator<Emp1> employeeiterator = employees.iterator();
		Emp1 employee = null;
		while (employeeiterator.hasNext()) {
			employee = employeeiterator.next();
			System.out.println(employee.id + "," + employee.name);

		}
	}

}
