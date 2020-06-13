package com.incubyte.calculator.test.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.incubyte.calculator.service.StringCalculatorService;

public class StringCalculatorTestService {

  @Test
  public void testFor2Numbers() {
    StringCalculatorService stringCalculatorservice = new StringCalculatorService();
    assertEquals(0, stringCalculatorservice.Add(" "));
    assertEquals(1, stringCalculatorservice.Add("1,"));
    assertEquals(24, stringCalculatorservice.Add("1,23"));
  }


  @Test
  public void testForNumbers() {
    StringCalculatorService stringCalculatorservice = new StringCalculatorService();
    assertEquals(8, stringCalculatorservice.Add("1,2,2,3"));
    assertEquals(280, stringCalculatorservice.Add("1,82,4,23,32,44,94"));
  }

  @Test
  public void testForNumbersSerpatedwithNewLine() {
    StringCalculatorService stringCalculatorservice = new StringCalculatorService();
    assertEquals(8, stringCalculatorservice.Add("1\n2\n2\n3"));
    assertEquals(280, stringCalculatorservice.Add("1\n82\n4\n23\n32\n44\n94"));
  }

  @Test
  public void testForNumbersSerpatedwithMultipleDel() {
    StringCalculatorService stringCalculatorservice = new StringCalculatorService();
    assertEquals(6, stringCalculatorservice.Add("//;\n1;2\n3"));
    assertEquals(14, stringCalculatorservice.Add("//;\n;2\n3;//9"));
    assertEquals(280, stringCalculatorservice.Add("1\n82\n4\n23\n32\n44\n94"));
  }

  @Test
  public void testForNegativeNumbers() {
    StringCalculatorService stringCalculatorservice = new StringCalculatorService();
    try {
      stringCalculatorservice.Add("//-1,2");

    } catch (Exception e) {
      assertEquals("Negative Not allowed = -1", e.getMessage());
    }
    try {
      stringCalculatorservice.Add("//1,-4,2");

    } catch (Exception e) {
      assertEquals("Negative Not allowed = -4", e.getMessage());
    }
  }
  
  @Test
  public void testForNumberGreaterThan1000() {
    StringCalculatorService stringCalculatorservice = new StringCalculatorService();
    assertEquals(1004, stringCalculatorservice.Add("//;\n1;1000\n3"));
    assertEquals(12, stringCalculatorservice.Add("//;\n;2000\n3;//9"));
    assertEquals(1194, stringCalculatorservice.Add("1\n1000\n1202\n23\n32\n44\n94"));
  }

}
