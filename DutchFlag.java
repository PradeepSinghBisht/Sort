/*Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.*/

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
