package com.example.tests;

import java.util.Arrays;

public class Program {
  public static void main(String[] args) {
    System.err.printf("Hello world %s\n", Library.combine(Arrays.asList(args), "+"));
  }
}
