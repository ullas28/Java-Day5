/*2. Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.*/

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 999;

        if (a > x) {
            if ((a % 4) == 0) {
                if ((a % 100) == 0) {
                    if ((a % 400) == 0) {
                        System.out.println("Its a leap year");
                    } else
                        System.out.println("Its not a leap year");
                } else
                    System.out.println(a + " It's a Leap Year");
            } else
                System.out.println("It's not a Leap year");
        }
    }
}
