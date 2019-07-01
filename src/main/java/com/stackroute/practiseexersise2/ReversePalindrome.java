package com.stackroute.practiseexersise2;

import java.util.Scanner;
//class to reverse a string and check if palindrome
public class ReversePalindrome
    {
        //method to reverse a string and check if palindrome
        public static String reversePalindrome(String input)
        {

            String reverse = "";
            String output;

            for(int i = input.length() - 1; i >= 0; i--)
            {
                reverse = reverse + input.charAt(i);
            }
            output = "reverse of string is"+reverse;
            if(input.equals(reverse)){
                output="String is a palindrome";
            }
            else {
                output="String is not a palindrome";
            }
            return output;
        }
    }

