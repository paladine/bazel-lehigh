package com.example.tests;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import com.google.common.testing.NullPointerTester;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

@RunWith(JUnit4.class)
public class LibraryTest {

  @Test
  public void verifyLibraryHandlesNulls() {
    new NullPointerTester().testAllPublicStaticMethods(Library.class);
  }

  @Test
  public void verifyLibraryGeneratedExpectedOutput_Plus() {
    assertThat(Library.combine(ImmutableList.of("one", "two", "three"), "+"))
      .isEqualTo("one+two+three");
  }

  @Test
  public void verifyLibraryGeneratedExpectedOutput_Minus() {
    assertThat(Library.combine(ImmutableList.of("one", "two", "three"), "-"))
      .isEqualTo("one-two-three");
  }

  @Test
  public void verifyLibraryGeneratedExpectedOutput_Empty() {
    assertThat(Library.combine(ImmutableList.of("one", "two", "three"), ""))
      .isEqualTo("onetwo+three");
  }

  @Test
  public void verifyLibraryGeneratedExpectedOutput_EmptyList() {
    assertThat(Library.combine(ImmutableList.of(), ""))
      .isEqualTo("");
  }

  @Test
  public void verifyLibraryGeneratedExpectedOutput_OneEntryNoCombiner() {
    assertThat(Library.combine(ImmutableList.of("one"), "+"))
      .isEqualTo("one");
  }
}
