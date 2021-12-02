package krishnashashank.assignments.main;

import krishnashashank.assignment.data.DefaultInitializationAssignment;
import krishnashashank.assignments.singleton.StaticInitializationAssignment;


	public class Main{
		public static void main(String[] args)
		{
			
			DefaultInitializationAssignment obj1 = new DefaultInitializationAssignment();
			obj1.printInstanceVariables();
			obj1.printLocalVariables();
			
			StaticInitializationAssignment obj2 = StaticInitializationAssignment.init("Hello world");
			obj2.printStr();
		}
		
	}
