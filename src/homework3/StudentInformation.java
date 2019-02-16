package homework3;

import java.util.Scanner;

public class StudentInformation extends StudentProgram implements Student {
	String sdFullName;
	String stDOB;
	int stID;
	boolean studentStatus = true;
	
	Scanner sc = new Scanner(System.in);
	
	public void printStudentStatus() {
		if (studentStatus == true)
			System.out.println("This student is approuved to be welcome in our school");
		else
			System.out.println("NO , this  student is NOT approuved to study in our school");
	}
		
	public void studentFullName() {
		System.out.println("Please enter your full name ");
		sdFullName = sc.next();
		
	}
	
	public void studentDateOfBirth() {
		System.out.println("Please enter your date of birth ");
		stDOB = sc.next();
	}

	
	public void studentId() {
		System.out.println("Please enter your student ID ");
		stID = sc.nextInt() ;
		
	}
	
//    	StudentProgram avrage = new  StudentInformation();
//    	avrage.
//	

	}


