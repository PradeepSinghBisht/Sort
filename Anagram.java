/*
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 300
1 ≤ |s| ≤ 106

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO

Explanation:
Testcase 1: Both the string have same characters with same frequency. So, both are anagrams.
Testcase 2: Characters in both the strings are not same, so they are not anagrams.
*/

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++){
            String str1 = scanner.next();
            String str2 = scanner.next();
            if (str1.length() != str2.length()){
                System.out.println("NO");
            }
            else {
                System.out.println(match(str1,str2));
            }
        }
    }
    public static String match(String str1, String str2){
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++){
            if (array1[i] == array2[i]){
                continue;
            }
            else {
                return "NO";
            }
        }
        return "YES";
    }
}
/*
    public static String match(String str1, String str2){
        char[] array1 = new char[26];
        char[] array2 = new char[26];
        for (int  i = 0; i < str1.length(); i++){
            array1[str1.charAt(i)-'a'] += 1;
        }
        for (int j = 0; j < str2.length(); j++){
            array2[str2.charAt(j)-'a'] += 1;
        }
        for (int k = 0; k < 26; k++){
            if (array1[k] == array2[k]){
                continue;
            }
            else {
                return "NO";
            }
        }
        return "YES";
    }
*/
