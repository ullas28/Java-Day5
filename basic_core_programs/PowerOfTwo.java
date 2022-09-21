package com.bridgelabz.basic_core_programs;

public class PowerOfTwo {
    public static void main(String args[]) {
        int N;
        try {
            N = Integer.parseInt(args[0]);
            double power = 0;
            if (N >= 0 && N < 31) {
                for (int i = 0; i <= N; i++) {

                    power = power + Math.pow(2, i);

                }
                System.out.println(power);
            }else{
                System.out.println("Integer Limit is exceeded/2^31 overflows an int");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer command line arguments: " + e.toString());
        }

    }
}

