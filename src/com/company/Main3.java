package com.company;

public class Main3 {
    public static void PrintSymbol(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        PrintSymbol(5);
    }
}