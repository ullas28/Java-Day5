/*Java Program to Check Whether an Alphabet is Vowel or Consonant*/

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character to check whether it's a vowel or not");
        char ch = s.next().charAt(0);
        int i = 0;
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :i++;
        }
        if(i==1)
            System.out.println("Entered character "+ch+" is  Vowel");
        else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonent");
        else
            System.out.println("Not an alphabet");
    }
}
