/*Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.*/

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class PrimeFactor {
    public static void primeFactors(int n)
    {
        System.out.println("Prime factors of " + n +":");
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        //In traversing i*i <= n or i <= Math.sqrt(n) or i<=n will also work
        for (int i = 3; i*i <= n; i += 2) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors");
        int n = s.nextInt();
        primeFactors(n);
    }
}
