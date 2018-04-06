package com.example.mavendeps;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Joiner;

public class Program implements Runnable {
  private static final Joiner COMMA_JOINER = Joiner.on(",");
  private final String[] args;

  public static void main(String[] args) {
    checkArgument(checkNotNull(args).length <= 5, "can't have more than 5 arguments");
    new Program(args).run();
  }

  public Program(String[] args) {
    this.args = args;
  }

  @Override
  public void run() {
    System.err.printf("Hello world! %s\n", COMMA_JOINER.join(args));
  }
}
