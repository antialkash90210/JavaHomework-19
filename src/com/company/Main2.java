package com.company;

import java.util.Scanner;

public class Main2 {


    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(((2*factorial(5)+3*factorial(8))/(double)(factorial(6)+factorial(4))));
    }
}