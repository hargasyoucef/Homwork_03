package homework3;

import java.util.Scanner;

public abstract class StudentProgram  {
	int [] grade = new int[10];
	long average;
	int sum=0 ;
	
	SeasonProgram trimester;
	Scanner scs = new Scanner(System.in);
	public void StudentProgram() {}
	
	public void StudentProgram(SeasonProgram trimester) {
		this.trimester = trimester;
	}
	
	public void wichSimetser(SeasonProgram trimester) {
		switch (trimester) {
		case trimester1:
			System.out.println("1st trimester modules: Math, Physics, Phylosiphy, ");
			break;
		case trimester2:
			System.out.println("2nd Trimester modules: History, English,  Electicity  ");
			break;
		case trimester3:
			System.out.println("3rd Trimester modules: Goegraphy, Music, Science, Biology");
			break;
			default:
				System.out.println("sorry, you have only 3 trimester !!");
			
			
		}
  	}
	
	public void studentGrades() {
		System.out.println("Please enter your exam grades, knowing that youhave 10 modules: ");
		
		for (int i=0 ; i<10 ; i++) {
			System.out.println("your grade in module# "+(i+1) + " is:");
			grade[i]= scs.nextInt();
			}
			
	}
		public void studentAverage() {
			
			for (int j=0 ; j<10 ; j++) {
			 sum += grade[j];			 
			 }
			System.out.println("Your total grades is: " +sum);
			average = sum/10 ;
			System.out.print("Your average is: " +average +",  ");
			if (average >= 90) {
				System.out.println("Excelent, you get A+");
				}
			else if ( average <90 && average >= 80) {
				System.out.println("Very Good,  you get B");				
			}
			else if (average<80 && average>=60) {
				System.out.println("Nice, you get C");
			}
			else 
				System.out.println("You have to improve your skills !! ");

			System.out.println("Your Average of this year is: "+ average);		
		
		}
	
}
