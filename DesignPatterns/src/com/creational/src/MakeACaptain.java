package com.creational.src;

public class MakeACaptain {
	
	//private static MakeACaptain _captain;
	
	private MakeACaptain(){
		
	}
	
	// In Multiple thread scenario, this will fail...
	/*public static MakeACaptain getCaptain(){
		// Lazy initialization
		if(_captain == null){
			_captain = new MakeACaptain();
			System.out.println("New Captain selected for our team");
		}
		else{
			System.out.println("You already have a captain for your team.");
			System.out.println("Send him for the toss");
		}
		return _captain;		
	}*/
	
	// Eager Initialization
	/*private static MakeACaptain _captain = new MakeACaptain();
	
	public static MakeACaptain getCaptain(){
		return _captain;
	}*/

	// Using private inner class
	private static MakeACaptain _captain;
	
	
	private static class MakeACaptainHelper{
		private final static MakeACaptain _captain = new MakeACaptain();
	}
	
	public static MakeACaptain getCaptain(){
		return MakeACaptainHelper._captain;
	}
	
	
	
}
