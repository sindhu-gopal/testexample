package coreexample;



public class StudentMain {

	public static void main(String[] args)
	{
		Student S = new Student();
		
		S.Id = 12;
		
		Student.Id = 12;
		
		S.setId(101);
		S.setName("rajasri");
		S.setGender('m');
		S.setTelugumarks(78);
		S.setHindimarks(60);
		S.setMathsmarks(80);
		S.setSciencemarks(90);
		S.setSocialmarks(75);

		//System.out.println("ID:" + Student.getId());
		System.out.println("Gender:" + S.getGender());
		System.out.println("NAME:" + S.getName());
		System.out.println("TELUGUMARKS:" + S.getTelugumarks());
		System.out.println("HINDIMARKS:" + S.getHindimarks());
		System.out.println("MathsMARKS:" + S.getMathsmarks());
		System.out.println("SCIENCEMARKS:" + S.getSciencemarks());
		System.out.println("SOCIALMARKS:" + S.getSocialmarks());

		StudentMain sm = new StudentMain();
		float language = StudentMain.getTotal(S.getTelugumarks(), S.getHindimarks());
		float nonlanguage = StudentMain.getTotal(S.getMathsmarks(), S.getSciencemarks(), S.getSocialmarks());

		System.out.println("Language:" + language);
		System.out.println("Non_Language:" + nonlanguage);
	}

	//Static: static propeties and methods can be accessed with the help of class name instead object name;
	public static int getTotal(int Telugu, int hindi) {

		return Telugu + hindi;
	}

	public static int getTotal(int Maths, int Science, int Social) {

		return Maths + Science + Social;
	}
	}


