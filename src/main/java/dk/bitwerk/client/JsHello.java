package dk.bitwerk.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
@JsNamespace("poc")
public class JsHello {
	private Listener listener;

	public String ping() {
		return "ping received from host page";
	}

	public void register(Listener listener) {
		this.listener = listener;
	}

	public void invoke(String event) {
		listener.onEvent("Disppatched: " + event);
	}
}
