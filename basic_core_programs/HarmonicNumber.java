/*Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of N for Harmonic series");
        int num = s.nextInt();
        double result = 0.0;

        System.out.println("The harmonic series is: ");

            while (num > 0) {
                result = result + (double)1 / num;
                num--;
                System.out.print(result + ", ");
            }
    }
}
