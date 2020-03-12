package coreexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class EmplyeeMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(3, "priya"));
		employees.add(new Employee(5, "sindhu"));
		employees.add(new Employee(1, "srilakshmi"));
		employees.add(new Employee(6, "hello"));
		employees.add(new Employee(2, "sri"));
		Collections.sort(employees);

		Iterator<Employee> employeeiterator = employees.iterator();
		Employee employee = null;
		while (employeeiterator.hasNext()) {
			employee = employeeiterator.next();
			System.out.println(employee.getId() + "," + employee.getName());
		}
	}

}
