package homework3;

public class SchoolRules {
	private SchoolRules() {}
	
	public static SchoolRules getInstance() {
		SchoolRules law = new SchoolRules();
		return law;
	}
	
	public void SchoolRulesExammple() {
		System.out.println("Keep the shool area clean");
		System.out.println("Be nice with people ");
	}

}
