package com.company;

import java.util.Scanner;

public class Kadane {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++){
            int size = scanner.nextInt();
            int[] array = new int[size];
            for(int i = 0; i < array.length; i++){
                array[i] = scanner.nextInt();
            }
            System.out.println(kadanes(array));
        }
    }
    public static int kadanes(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                sum += array[j];
                max = max < sum ? sum : max;
            }
            sum = 0;
        }
        return max;
    }
}


