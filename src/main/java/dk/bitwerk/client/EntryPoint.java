package dk.bitwerk.client;

import com.google.gwt.core.shared.GWT;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

	@Override
	public void onModuleLoad() {
		MyFunctionalInterface func = (String name) -> { return "Hello " + name; };
		GWT.log(func.sayHello("there"));
	}
}

interface MyFunctionalInterface {
	String sayHello(String name);
}