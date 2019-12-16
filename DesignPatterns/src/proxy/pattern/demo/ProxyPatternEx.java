package proxy.pattern.demo;

import proxyclasses.Proxy;

public class ProxyPatternEx {

	public static void main(String[] args) {
		System.out.println("*** Proxy pattern Demo ***");
		Proxy px = new Proxy();
		px.doSomeWork();
	}

}
