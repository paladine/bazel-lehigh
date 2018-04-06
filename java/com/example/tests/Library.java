package com.example.tests;

import com.google.common.base.Joiner;

public class Library {
  public static String combine(Iterable<String> values, String delimiter) {
    return Joiner.on(delimiter).join(values);
  }
}

