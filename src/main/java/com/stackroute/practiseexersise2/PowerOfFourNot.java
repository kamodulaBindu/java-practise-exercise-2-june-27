package com.stackroute.practiseexersise2;
//class to check if the number is power of four or not
public class PowerOfFourNot {

        public static String isPowerOfFour(int n)
        {
            if ((n==0))
                return "0";
            while (n!=1)
            {
                if(n%4!=0)//if not power of four
                    return "it is not a power of 4";
                n = n/4;
            }
            return "it is power of 4";

        }
    }


