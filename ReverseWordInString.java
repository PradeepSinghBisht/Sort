package com.company;

import java.util.Scanner;

public class ReverseWordInString {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            String str1 = scanner.next();
            reverseWord(str1);
        }
    }
    public static void reverseWord(String str1){
        String[] string = str1.split("[.]");
        for (int i = string.length-1; i >= 0; i--){
            if (i == 0){
                System.out.println(string[i]);
            }
            else {
                System.out.print(string[i] + ".");
            }
        }
    }
}
