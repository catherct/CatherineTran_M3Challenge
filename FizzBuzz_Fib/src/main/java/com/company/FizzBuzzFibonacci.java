package com.company;

import java.util.Scanner;

public class FizzBuzzFibonacci {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int userInput1 = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the second integer: ");
        int userInput2 = Integer.parseInt(myScanner.nextLine());


        //FizzBuzz
        System.out.println("\n" + "FizzBuzz" + "\n" + "========");

        for (int i = 1; i <= userInput1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        //Fibonacci
        System.out.println("\n" + "Fibonacci" + "\n" + "========");

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= userInput2; ++i) {
            System.out.println(num1);
            int num3 = num1 + num2;
   //         i = fib[i-2] + fib[i-1]; /* fibonacci = add two previous numbers together
                                        //  [two away from i] + [one away from i] */
            num1 = num2;
            num2 = num3;
            }
        
        }
    }