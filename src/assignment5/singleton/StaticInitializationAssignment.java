package krishnashashank.assignments.singleton;

public class StaticInitializationAssignment{
	private String str;
	
	public static StaticInitializationAssignment init(String str)
	{
		//this.str=str;
		//we cannot access instance variables from a static context
		
		StaticInitializationAssignment obj = new StaticInitializationAssignment();
		
		return obj;
		
	}
	
	public void printStr()
	{
		
		System.out.println(this.str);
	}
	
}
