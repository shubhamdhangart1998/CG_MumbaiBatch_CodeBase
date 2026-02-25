package com.tnsif.daytwo.DecisionMakingStmt;

public class NestedIfElseDemo {

	public static void main(String[] args) {
	
		
		int a=-1, b=0, c=1;
		
		System.out.println("the Largest No is ");
		
		if(a>b) 
		{
			if(a> c)
				System.out.println(a);
			
			else 
				System.out.println(c);
		}
		else {
			if(c>b)
				System.out.println(c);
			else 
				System.out.println(b);
			
		}
		
		
	

	}

}
