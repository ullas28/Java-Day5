/*Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:
Wind chill = 35.74 + 0.6215T + (0.4275T – 35.75)V^0.16
Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).*/

package com.bridgelabz.functional_programs;

import java.util.Scanner;

//to find the wind chill from the given temperature and wind speed.
public class WindChill {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahreheit: ");
        double t = scn.nextDouble();
        System.out.println("Enter the wind speed: ");
        double v = scn.nextDouble();
        if (t > 50 || v > 120 || v < 3) {
            System.out.println("invalid");
        }else{
        double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16));
        System.out.println("The wind chill is: " + w);
    }
    }
}