/*2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen*/

package com.bridgelabz.functional_programs;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray  {
        @SuppressWarnings("resource")
        public static void main(String[] args) {
            System.out.println("Enter number of rows: ");
            Scanner u = new Scanner(System.in);
            int m = u.nextInt();
            System.out.println("Enter number of columns: ");
            int n = u.nextInt();

            int[][] a = arrayInt(m, n);
            double[][] b = arrayDouble(m, n);
            boolean[][] c = arrayBoolean(m, n);

            display(a, b, c, m, n);
        }


        @SuppressWarnings("resource")
        public static int[][] arrayInt(int m, int n) {
            int a[][] = new int[m][n];
            Scanner u = new Scanner(System.in);
            System.out.println();
            System.out.println("Integer Array");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = u.nextInt();
                }
            }
            return a;
        }


        @SuppressWarnings("resource")
        public static double[][] arrayDouble(int m, int n) {
            double b[][] = new double[m][n];
            Scanner u = new Scanner(System.in);
            System.out.println();
            System.out.println("Double Array");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = u.nextDouble();
                }
            }
            return b;
        }


        @SuppressWarnings("resource")
        public static boolean [][] arrayBoolean(int m, int n) {
            boolean c[][] = new boolean[m][n];
            Scanner u = new Scanner(System.in);
            System.out.println();
            System.out.println("Boolean Array");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = u.nextBoolean();
                }
            }
            return c;
        }


        public static void display(int[][] a, double[][] b, boolean[][] c, int m, int n) {
            PrintWriter pw = new PrintWriter(System.out, true);

            System.out.println();
            pw.println("2D ARRAY INTEGER");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pw.print("\t" + a[i][j] + " ");
                }
                pw.println("\t");
            }

            System.out.println();
            pw.println("2D ARRAY DOUBLE");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pw.print("\t" + b[i][j] + " ");
                }
                pw.println("\t");
            }

            System.out.println();
            pw.println("2D ARRAY BOOLEAN");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pw.print("\t" + c[i][j] + " ");
                }
                pw.println("\t");
            }
        }
    }
