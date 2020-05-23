/*
Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
*/

package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

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

            sum -= IntStream.of(array).sum();                //O(N) time complexity

            /*for (int j = 0; j < array.length-1; j++){
               sum -= array[j];                              //O(N) time complexity
            }*/

            System.out.println(sum);

            /*Arrays.sort(array);                            //O(N Log N) time complexity 
            int k = 1;
            for (int i = 1; i < array.length; i++){
                if (array[i] == k){
                    if (i == size - 1){
                        System.out.println(++k);
                    }
                    k++;
                }
                else {
                    System.out.println(k);
                    break;
                }
            }*/
        }
    }
}
