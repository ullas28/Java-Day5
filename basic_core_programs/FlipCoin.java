/*1. Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails*/

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of times to Flip Coin ");
        int s1 = s.nextInt();
        int s2 = 1;
        int count1 = 0, count2 = 0;
        while (s2 <= s1) {
            if (Math.random() < 0.5) {
                System.out.println("Tails");
                count1++;
            } else {
                System.out.println("Heads");
                count2++;
            }
            s2++;
        }
        System.out.println(count1+count2);
        float headsPercentage = (float)count2/s1;
        float tailsPercentage =(float)count1/s1;
        System.out.println("Percenatge of Heads\t" + headsPercentage*100 +"\t Percenatage of Tails\t" + tailsPercentage*100);
    }
}

