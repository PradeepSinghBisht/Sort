package com.company;

import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++) {
            int size1 = scanner.nextInt();
            int size2 = scanner.nextInt();
            int[] array1 = new int[size1];
            int[] array2 = new int[size2];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = scanner.nextInt();
            }
            for (int i = 0; i < array2.length; i++){
                array2[i] = scanner.nextInt();
            }
            mergeInPlace(array1, array2);
            for (int a = 0; a < array1.length; a++){
                System.out.print(array1[a] + " ");
            }
            for (int a = 0; a <array2.length; a++){
                System.out.print(array2[a] + " ");
            }
        }
    }
    public static void mergeInPlace(int[] array1, int[] array2){
        int k = 0;
        while (k < array1.length){
            if (array1[k] < array2[0]){
                k++;
            }
            else if (array1[k] > array2[0]){
                int temp = array1[k];
                array1[k] = array2[0];
                array2[0] = temp;
                k++;
                int local = array2[0];
                int i;
                for (i = 0; i < array2.length-1; i++){
                    if (local > array2[i+1]){
                        array2[i] = array2[i+1];
                    }
                    else {
                        array2[i] = local;
                        break;
                    }
                }
                if (i == array2.length-1){
                    array2[i] = local;
                }
            }
        }
    }
}
