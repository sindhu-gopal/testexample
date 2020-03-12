package coreexample;



public class Employee implements Comparable<Employee>{

	int id;
	String name ;

   Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee other) {
		
		if (this.id > other.id) {
			return 1;
		} else if (this.id < other.id) {
			return -1;
		} else {
			return 0;
		}
	}


}
