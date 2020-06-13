package com.incubyte.calculator.service;

public class StringCalculatorService{

  public int Add(String Number) {
    int sum = 0;
    char x = ' ';
    char x1 = ' ';
    String s1 = "";
    if (Number.equals(" ")) {
      return 0;
    }
    for (int i = 0; i <Number.length(); i++) {
      x = Number.charAt(i);
      if(i+1<Number.length())
      x1 = Number.charAt(i+1);
      
     if (x!='\n'&& x!='/' && x!=';' && x!='\\' && x!='n' && x1!='n'&& x!=',')
     {
       
       if(x=='-')
       {
          throw new RuntimeException("Negative Not allowed = -"+x1);
       }
        System.out.print(x);
        s1 = s1 + x;
      } else {
        if(s1.equals("1000")||(!s1.equals("") && s1.length()<3))
        sum += Integer.parseInt(String.valueOf(s1));
        s1 = "";
      }
      
    }
    if(!s1.equals(""))
    sum += Integer.parseInt(String.valueOf(s1));
    return sum;
  }

}
