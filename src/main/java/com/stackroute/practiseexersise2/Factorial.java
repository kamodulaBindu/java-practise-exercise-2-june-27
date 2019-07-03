package com.stackroute.practiseexersise2;

public class Factorial {
    //method to return factorial of a number
    public String factorialOfNumber(int number) {
        if (number > 0) {
            int i, j;
            int factorial = 1;
            String[] string = new String[number];
            String str = "";
            for (i = 1; i <= number; i++) {
                factorial = 1;
                for (j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                string[i - 1] = "the factorial of" + (i) + "is" + factorial;
            }
            for (i = 0; i < number; i++) {
                str = str + string[i] + "\n";
            }
            return str;
        } else {
            return null;
        }
    }
}