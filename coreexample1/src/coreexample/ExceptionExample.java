package coreexample;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("start");
		int totalmarks = 500;
		int totalsubjects = 0;
		float avgmarks = 0;
		String errormessage =null;
		try {
			avgmarks = totalmarks / totalsubjects;
		} catch (Exception e) {
			System.out.println("catch block");
			errormessage="check later";
		} finally {
			System.out.println("finally block");
		}
		if (errormessage!=null) {
			System.out.println(errormessage);
		} else {
			System.out.println("AvgMarks:" + avgmarks);
		}
		System.out.println("END");

	}

}
