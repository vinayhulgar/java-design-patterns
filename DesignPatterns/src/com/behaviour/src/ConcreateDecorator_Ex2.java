package com.behaviour.src;

public class ConcreateDecorator_Ex2 extends AbstractDecorator{

	public void doJob(){
		System.out.println("");
		System.out.println("**** START EX2 ****");
		super.doJob();
		System.out.println("Explicitly from DecoratorEx_2");
		System.out.println("**** End EX2 ****");
		
	}
}
