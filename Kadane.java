/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107

Example:
Input
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
Output
9
-1

Explanation:
Testcase 1: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
*/

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


