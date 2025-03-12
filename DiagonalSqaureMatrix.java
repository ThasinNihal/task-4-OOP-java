
package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class DiagonalSqaureMatrix {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Input the size of the matrix
        System.out.print("Enter the size of the square matrix (n): ");
        int n = scanner.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[n][n];
        
        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate the sum of the main diagonal and the secondary diagonal
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }
        
        // Output the results
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
        
        scanner.close();
    }
    
}
