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

}
