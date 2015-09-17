package dk.bitwerk.client;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

  @Override
  public void onModuleLoad() {
    // GWT.log("Entrypoint loaded ...");
    jsLog("GWT Entrypoint loaded ...");
    
  }

  // I prefer to log directly on browser console
  public native void jsLog(String msg) /*-{
    console.log(msg);
	}-*/;

}
