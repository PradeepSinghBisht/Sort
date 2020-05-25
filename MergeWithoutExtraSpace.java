/*
Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}  

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20} 
Input:
First line contains an integer T, denoting the number of test cases. First line of each test case contains two space separated integers X and Y, denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers, denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.

Constraints:
1 <= T <= 100
1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109

Example:
Input:
2
4 5
1 3 5 7
0 2 6 8 9
2 3
10 12
5 18 20

Output:
0 1 2 3 5 6 7 8 9
5 10 12 18 20

Explanation:
Testcase 1: After merging two non-decreasing arrays, we have, 0 1 2 3 5 6 7 8 9.
*/
 
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
