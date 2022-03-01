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


//        //Fibonacci
//        System.out.println("\n" + "Fibonacci" + "\n" + "========");
//
//        int[] fib = new int[userInput2];
//
//        fib[0] = 0; //0th number in fib series is 0
//            System.out.println(fib[0]);
//        fib[1] = 1; // 1st number in fib series is 1
//            System.out.println(fib[1]);
//
//        for (int i = 2; i <= fib.length; i++) {
//                i = fib[i-2] + fib[i-1]; /* fibonacci = add two previous numbers together
//                                             [two away from i] + [one away from i] */
//                System.out.println(i);
//            }
        
        }
    }