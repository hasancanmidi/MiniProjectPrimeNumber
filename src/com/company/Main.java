package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int reminder = number % 2;
        boolean isPrime = true;

        if(number==1){
            System.out.println("the number is not prime.");
            return;
        }
        if(number<1){
            System.out.println("invalid number");
            return;
        }

        for(int i = 2; i<number;i++){
            if(number % i == 0){
                isPrime  = false;
            }
        }
        if(isPrime){
            System.out.println("the number is prime.");
        }else {
            System.out.println("the number is not prime.");
        }

    }
}
