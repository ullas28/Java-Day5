/*Java Program to Swap Two Numbers*/
package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args)
    {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the numbers x and y to swap");
        int x = s.nextInt(), y = s.nextInt();

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
