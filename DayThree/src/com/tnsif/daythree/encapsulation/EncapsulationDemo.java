package com.tnsif.daythree.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		//obj creation 
		OopsCanceptsDemo obj=new OopsCanceptsDemo();
		obj.setName("SHubham");
		obj.setAge(34);
		obj.setSerialNum(1001);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerialNum());
		
		System.out.println(obj);

	}

}
