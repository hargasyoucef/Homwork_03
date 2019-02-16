package homework3;

public class SchoolInfo {
	private String schoolName;
	private int nuberOfStudent;
	
	public SchoolInfo() {}
	
	public SchoolInfo(String schoolName, int nuberOfStudent) {
		this.schoolName = schoolName;
		this.nuberOfStudent = nuberOfStudent;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getnuberOfStudent() {
		return nuberOfStudent;
	}
	public void setnuberOfStudent(int nuberOfStudent) {
		this.nuberOfStudent = nuberOfStudent;
	}
	
	public  String SchoolInformation(String schoolAdress, String schoolWebSite ){
		String note =schoolAdress + schoolWebSite;
		return note;
		
	}

	public  int SchoolInformation(int numberOfBoys, int numberOfGirls, int numberOfTeachers ){
		int total =numberOfGirls + numberOfBoys + numberOfTeachers;
		return total;
		
	}
	
	
	

}
