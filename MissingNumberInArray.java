package com.company;

import java.util.Scanner;

public class MissingNumberInArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length-1; i++) {
                array[i] = scanner.nextInt();
            }

            int sum = 0;
            sum = (size * (size + 1))/2;

            for (int j = 0; j < array.length-1; j++){
               sum -= array[j];
            }
            System.out.println(sum);
        }
    }
}
