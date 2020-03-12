package coreexample;

public class Exceptionhandlingex1 {

	public static void main(String[] args) {
		System.out.println("start");
		int totalmarks = 500;
		int totalsubjects = 0;
		float avgmarks = 0;
		String errormessage = null;

		try {
			avgmarks = getAvg(totalmarks, totalsubjects);
		} catch (Exception e) {
			errormessage = "there is some issuses please try again later";

		}
		if (errormessage != null) {
			System.out.println(errormessage);
		} else {
			System.out.println("AverageMarks:" + avgmarks);
		}
		System.out.println("End");
	}

	public static float getAverageMarks(int totalmarks, int totalsubjects) {
		float avgmarks = 0;
		try {
			avgmarks = totalmarks / totalsubjects;
		} catch (ArithmeticException e) {
			throw e;
		} catch (Exception ex) {
			throw ex;
		}
		return avgmarks;
	}

	public static float getAvg(int totalmarks, int totalsubjects) throws ArithmeticException, Exception {
		return totalmarks / totalsubjects;
	}
	

}
