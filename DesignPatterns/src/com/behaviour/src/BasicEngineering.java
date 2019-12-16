package com.behaviour.src;

public abstract class BasicEngineering {

	public void Papers(){
		// Common Papers
		Math();
		SoftSkills();
		// Specialized Paper
		SpecialPaper();
	}

	public abstract void SpecialPaper();

	private void SoftSkills() {
		System.out.println("SoftSkills");
	}

	private void Math() {
		System.out.println("Mathematics");
	}
	
	
	
	
}
