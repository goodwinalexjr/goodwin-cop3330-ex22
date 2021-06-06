package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = numbers.nextInt();
        System.out.print("Enter the second number: ");
        int b = numbers.nextInt();
        System.out.print("Enter the third number: ");
        int c = numbers.nextInt();

        int best = 0;

        if(a > b){
            if(a > c){
                best = a;
            }
        }
        else if(b > a){
            if(b > c){
                best = b;
            }
        }
        else if(c > a){
            if(c > b){
                best  = c;
            }
        }

        System.out.println("The largest number is " + best + ".");
    }
}
