package com.company;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 7;
        for (int i = 0; i < 4; i++){
            int j = 0;
            while (j < m){
                System.out.print(n + " ");
                j++;
            }
            System.out.println();
            n--;
            m-=2;
        }
        n = 2;
        m = 4;
        for (int j = 0; j < 3; j++){
            int k = 0;
            while (k < m){
                System.out.print(n + " ");
                k++;
            }
            System.out.println();
            m += 2;
            n++;
        }
    }
}