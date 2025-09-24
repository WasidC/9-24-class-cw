package com.pluralsight;

public class main {
    public static void main(String[] args) {

       /* int x = 5;

        int y;
        System.out.println("===============");
        y = ++x;

        System.out.println(y);
        System.out.println(x); */


       /* long firstNumber = 3000000000L;

        float secondNumber = 3.45f; */

      /*
       // Widening
       int myInt = 9;
        long myLong;
        myLong = myInt;

        float myFloat = 3.8f;
        double myDouble;

        myDouble = myFloat; */

      /*  System.out.println("======================");

        //Narrowing
        int myInt;
        long myLong = 9123123123123123131L;

        myInt = (int) myLong;  //casting in java (may lose extra data) */

     /* //rounding numbers
        float value = 1234.567f;

        int wholeNumber = Math.round(value);

        System.out.println(wholeNumber); */

      /*  double expressionnResult = 1 - 2 * Math.pow(2, 2);
        System.out.println(expressionnResult)
       */

      /*  int firstNumber = 5;
        int secondNumber = 10;

        int minimumNumber = Math.min(firstNumber, secondNumber);
        System.out.println(minimumNumber);

       */

        int answer = 0;

        answer = answer + 10; // answer += 10; (this does the same shortcut)
        answer = answer - 5; // answer -= 5;
        answer = answer * 10; // answer *= 10;
        answer = answer / 2; // answer /= 2;
        answer = answer % 10; // answer %= 10;
        answer = answer + 1; // answer += 1; // answer++
    }
}
