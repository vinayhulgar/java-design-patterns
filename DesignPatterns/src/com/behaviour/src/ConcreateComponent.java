package com.behaviour.src;

public class ConcreateComponent extends Component{

	@Override
	public void doJob() {
		System.out.println("I'm from Concreate Component - I am closed for modification");
	}

}
