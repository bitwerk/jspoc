package dk.bitwerk.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
@JsNamespace("poc")
public class JsHello {

  public String sayHello(String name) {
    return "Hello " + name;
  }
}
