package com.acme;

import jsinterop.annotations.JsType;

@JsType
public class IntParser {
  public static int parseArray(String[] args) {
    return Integer.parseInt(args[0]);
  }
}