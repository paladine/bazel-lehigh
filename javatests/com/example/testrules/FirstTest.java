package com.example.testrules;

import static com.google.common.truth.Truth.assertThat;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

@RunWith(JUnit4.class)
public class FirstTest {

  @Test
  public void verifyFirst() {
    assertThat(true).isEqualTo(true);
  }
}
