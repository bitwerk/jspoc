package dk.bitwerk.client;

import com.google.gwt.core.client.js.JsExport;

@JsExport("poc.Hello") 
public class JsHello  {
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
