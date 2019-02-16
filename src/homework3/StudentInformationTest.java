package homework3;

public  class StudentInformationTest {

	public static void main(String[] args) {
		Student studnt = new StudentInformation();
		StudentInformation st = new StudentInformation();
	
		SchoolInfo sclinfo = new SchoolInfo();
		sclinfo.setSchoolName("---------------<< Hudson College >>---------------");
		System.out.println("");
		sclinfo.getSchoolName();
		System.out.println(sclinfo.getSchoolName());
		sclinfo.setnuberOfStudent(890);
		sclinfo.getnuberOfStudent();
		sclinfo.SchoolInformation("The addres is17 Sip ave", ", and  the website is: www.hudsoncollege.com" );
		System.out.println(sclinfo.SchoolInformation("The addres is17 Sip ave", ", and  the website is: www.hudsoncollege.com" ));
		int total = sclinfo.SchoolInformation( 570, 320 , 120);
		System.out.println("The number of girls and boys and Teachers in our School is: "+total);
		System.out.println("");
		
		System.out.println("Now, you can start your registration");
			
//    		Student registration 
		
		studnt.studentFullName();
		studnt.studentDateOfBirth();
		studnt.studentId();
		st.printStudentStatus();
		
		System.out.println(" ");
		
//		Student grades and average and modules of simester
		StudentProgram program = new  StudentInformation();
		program.wichSimetser(SeasonProgram.trimester2);
		System.out.println("");

		program.studentGrades();
		program.studentAverage();
		
		
		SchoolRules rule = SchoolRules.getInstance();
				rule.SchoolRulesExammple();
		
	}

}
