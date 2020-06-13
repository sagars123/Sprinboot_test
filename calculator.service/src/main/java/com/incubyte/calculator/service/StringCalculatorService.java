package com.incubyte.calculator.service;

public class StringCalculatorService {

  public int Add(String Number) {
    int sum = 0;
    char x = ' ';
    String s1 = "";
    if (Number.equals(" ")) {
      return 0;
    }
    for (int i = 0; i <Number.length(); i++) {
      x = Number.charAt(i);
      System.out.print(x);
      if (x != ',') {
        s1 = s1 + x;
      } else {
        sum += Integer.parseInt(String.valueOf(s1));
        s1 = "";
      }
      
    }
    if(!s1.equals(""))
    sum += Integer.parseInt(String.valueOf(s1));
    return sum;
  }

}
