package com.behaviour.src;

public class ConcreateDecorator_Ex1 extends AbstractDecorator{
	
	public void doJob(){
		super.doJob();
		// Add additionl thing if necessary
		System.out.println("I am explicitly from Ex_1");
	}

}
