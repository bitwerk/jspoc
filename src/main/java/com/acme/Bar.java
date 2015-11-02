package com.acme;

import jsinterop.annotations.JsMethod;

public class Bar {
  @JsMethod
  public static int action(Foo foo) {
  	Baz baz = (Baz) foo;
    return baz.qux;
  }
}