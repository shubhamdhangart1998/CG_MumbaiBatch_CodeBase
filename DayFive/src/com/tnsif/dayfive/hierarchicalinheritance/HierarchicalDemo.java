package com.tnsif.dayfive.hierarchicalinheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		
		Person p1=new Person();
		System.out.println("------------Person details ");
		System.out.println(p1);
		
		//dynamic memory allocation 
		Person p;
		p=new Person("Vaishnavi", "Mumbai");
		System.out.println("Person Details : "+p);
		
		p=new Employee("Heti", "Delhi", 1001, 50989f, "IT");
		System.out.println("Employee Details : "+ p);
		
		p=new Student("Aditya", "hyderabad", "SY", 78.76f);
		System.out.println("STudent Details : "+ p);
		

	}

}
