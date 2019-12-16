package proxyclasses;

import originalclasses.ConcreateSubject;
import originalclasses.Subject;

public class Proxy extends Subject{
	ConcreateSubject cs = null;
	@Override
	public void doSomeWork() {
		System.out.println("Proxy call happenning now");
		// lazy initialization
		if(cs == null){
			cs = new ConcreateSubject();
		}
		cs.doSomeWork();
	}

}
