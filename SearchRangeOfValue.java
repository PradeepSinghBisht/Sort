package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SearchRangeOfValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int startPosition = -1;
        int endPosition = -1;
        for (int i = 0; i < n; i++){
            if (array[i] == k){
                startPosition = i;
                break;
            }
        }
        for (int i = n-1; i >= 0; i--){
            if (array[i] == k){
                endPosition = i;
                break;
            }
        }
        if (startPosition == -1 && endPosition == -1){
            System.out.println("-1");
        }
        else {
            System.out.println(startPosition + " " + endPosition);
        }
    }
}
