package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][4];
        int[][] B = new int[3][4];
        System.out.println("Enter elements for A martrix");

        //Getting input for A matrix 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.printf("A[%d][%d]= ",row,col);
                A[row][col] = input.nextInt();

            }

        }
        //display A
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" \t" + A[row][col]);

            }
            System.out.println();

        }
        System.out.println("Enter elements for B martrix");

        //Getting input for B matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.printf("B[%d][%d]= ",row,col);
                B[row][col] = input.nextInt();

            }

        }
        //Printing B matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" \t" +B[row][col]);

            }
            System.out.println();

        }
        System.out.println("A+B=");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" \t" +  (A[row][col]+B[row][col]));

            }
            System.out.println();

        }
    }
    
}
