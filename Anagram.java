package com.company;

import java.util.Scanner;

public class Anagram {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++){
            String str1 = scanner.next();
            String str2 = scanner.next();
            frequency(str1,str2);
        }
    }
    public static void frequency(String str1, String str2){
        int frequency1 = 0;
        int frequency2 = 0;
        for (int i = 0; i < str1.length(); i++){
            frequency1 += (int) str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++){
            frequency2 += (int) str2.charAt(i);
        }
        System.out.println((frequency1 == frequency2)?"YES":"NO");
    }
}
