
package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[3][2];
        System.out.println("Enter elements for A martrix");

        //Getting input for A matrix 
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]= ",row,col);
                A[row][col] = input.nextInt();

            }

        }
        //display A
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t" + A[row][col]);

            }
            System.out.println();

        }
        System.out.println("Enter elements for B martrix");

        //Getting input for B matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.printf("B[%d][%d]= ",row,col);
                B[row][col] = input.nextInt();

            }

        }
        //Printing B matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(" \t" +B[row][col]);

            }
            System.out.println();

        }
        // Initialize the result matrix
        int[][] result = new int[2][2];

        // Perform matrix multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}
