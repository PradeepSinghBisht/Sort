/*
Problem Statement
Given an array A of N integers, and a target value K. A is sorted in non-decreasing order. Write an efficient program to find
the start index and end index of K in A.

Input Format
First line contains integer N and K.
Second line contains N space sperated integers, which are members of array.

Output Format
Print the starting index and ending index of K in array A sepearted by a space. Print -1 if K is not found in A.

Sample Testcase
Input:
5 2
1 2 2 2 3

Output:
1 3
*/

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
