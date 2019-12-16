package com.behaviour.src;

abstract class AbstractDecorator extends Component{
	
	protected Component com;
	public void setTheComponent(Component c){
		com =c;
	}

	public void doJob(){
		if(com!=null){
			com.doJob();
		}
	}
}
