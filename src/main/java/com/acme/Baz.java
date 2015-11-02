package com.acme;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Baz implements Foo {
	public int qux;
}