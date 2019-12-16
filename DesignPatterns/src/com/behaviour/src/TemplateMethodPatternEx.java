package com.behaviour.src;

public class TemplateMethodPatternEx {

	public static void main(String[] args) {
		System.out.println("Template Method Pattern Demo");
		
		BasicEngineering bs = new ComputerScience();
		System.out.println("Computer Sc papers:");
		bs.Papers();
		System.out.println();
		bs = new Electronics();
		System.out.println("Electronics Papers:");
		bs.Papers();
	}

}
