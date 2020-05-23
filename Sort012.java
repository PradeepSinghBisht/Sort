package com.company;

import java.util.Scanner;

public class Sort012 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            int countZero = 0;
            int countOne = 0;
            int countTwo = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    countZero++;
                } else if (array[i] == 1) {
                    countOne++;
                } else if (array[i] == 2) {
                    countTwo++;
                }
            }
            int index = 0;
            for (int j = 0; j < countZero; j++) {
                array[index] = 0;
                index++;
            }
            for (int j = 0; j < countOne; j++) {
                array[index] = 1;
                index++;
            }
            for (int j = 0; j < countTwo; j++) {
                array[index] = 2;
                index++;
            }
            for (int k = 0; k < index; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
}