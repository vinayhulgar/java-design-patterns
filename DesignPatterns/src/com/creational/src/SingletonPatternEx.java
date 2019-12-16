package com.creational.src;

public class SingletonPatternEx {

	public static void main(String[] args) {
		System.out.println("*** Singleton Pattern Demo ***");
		System.out.println("Trying to make a captain for our team");
		MakeACaptain m1 = MakeACaptain.getCaptain();
		System.out.println("Trying to make another captain for our team");
		MakeACaptain m2 = MakeACaptain.getCaptain();
		if(m1 == m2){
			System.out.println("m1 & m2 are same instance");
		}
		
		
		
	}

}
