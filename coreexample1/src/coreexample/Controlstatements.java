package coreexample;

public class Controlstatements {

	public static void main(String[] args) {
		short s = 127;
		byte b = 50;
		int i = 123456789;
		long l = 4444;
		char gender = 'f';
		String str = "sindhu";
		float f = 25.1f;
		double d = 256.2455;
		boolean Status = false;
		if (Status == false) {
			System.out.println("status is false");
		}if(gender==f) {
			System.out.println("female");
		}
		else
			System.out.println("male");
		 short totalmarks=500;
		  String grade=" ";
		  if(totalmarks<550) {
			  grade="A+";
		  }else if(totalmarks<500) {
			  grade="A";
		  }else if(totalmarks<450) {
			  grade="B+";
		  } else if(totalmarks<400) {
			  grade="B";
		  }else {
			  grade="NA";
			}
		   System.out.println("Totalmarks:"+totalmarks);
		   System.out.println("grade:"+grade);
				
	}
	

}
