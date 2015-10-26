package dk.bitwerk.client;

import jsinterop.annotations.JsType;

@JsType(namespace="poc")
public class Dispatcher {
	public String dispatch(String action, Payload payload){
		if("action1".equals(action))
			return dispatchWithCast(payload);
		return "Unknown action: " + action;
	}
	
	public String dispatchWithCast(Payload payload){
		ConcretePayload obj = (ConcretePayload) payload;
		return obj.foo;
	}
}