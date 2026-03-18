package com.tnsif.dayfour.firstpackage;

public class Executor {

	public static void main(String[] args) {
		
		//accessing in same package class
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//b1.methodPrivate();
		
		b1.varProtected=21;
		b1.methodProtected();
		
		b1.vardefault=2345;
		b1.varPublic=345678;
		b1.methodDefault();
		b1.methodPublic();
		
		b1.setVarPrivate1(123456);
		System.out.println(b1.getVarPrivate1());
		

	}

}
