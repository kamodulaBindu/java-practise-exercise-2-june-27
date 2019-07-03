package com.stackroute.practiseexersise2;
//class to check if the number is power of four or not
public class PowerOfFourNot {

        public static String isPowerOfFourOrNot(int number)
        {
            if ((number==0))
                return "0";
            while (number!=1)
            {
                if(number%4!=0)//if not power of four
                    return "it is not a power of 4";
                number = number/4;
            }
            return "it is power of 4";

        }
    }


