/*Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.*/

package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class SumOfThreeInt {
    static void findTriplets(int[] arr, int n)
    {
        int count = 0;
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                        count++;
                    }
                }
            }
        }
        System.out.println("number of distinct triplets:\t" + count);


        if (found == false)
            System.out.println(" not exist ");
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int arr[] = new int [5];
        System.out.println("Enter five elements of array");
        for (int i = 0; i< arr.length;i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Elements of array is");
        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("distinct triplets are");
        int n = arr.length;
        findTriplets(arr, n);
    }
}

