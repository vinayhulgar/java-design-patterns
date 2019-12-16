package com.behaviour.src;

public class DecoratorPatternEX {

	public static void main(String[] args) {
		System.out.println("*** Decorator Pattern Demo ***");
		ConcreateComponent cc = new ConcreateComponent();
		ConcreateDecorator_Ex1 cd_1 = new ConcreateDecorator_Ex1();
		// Decorating ConcreateComponent object
		cd_1.setTheComponent(cc);
		cd_1.doJob();
		
		ConcreateDecorator_Ex2 cd_2 = new ConcreateDecorator_Ex2();
		// Decorating ConcreateComponent object
		cd_2.setTheComponent(cd_1);
		cd_2.doJob();
	
	}

}
