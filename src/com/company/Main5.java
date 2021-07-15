
package com.company;

import java.util.Scanner;

public class Main5 {
    public static int countString(String string, char letter){
        int countLetter = 0;
        char[]masLetter = new char[string.length()];
        masLetter = string.toCharArray();

        for (int i = 0; i < masLetter.length; i++) {
            if(masLetter[i] == letter){
                countLetter++;
            }
        }

        return ((countLetter*100)/masLetter.length);

    }
    public static void main(String[] args) {
        String string = "самый белый";
        char letter = 'й';

        System.out.println(countString(string,letter));
    }
}