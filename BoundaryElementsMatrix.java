
package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class BoundaryElementsMatrix {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][] A= new int [4][4];
        
        
        //getting input for A matrix
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.printf("Enter A[%d][%d]=",row,col);
                A[row][col]= input.nextInt();
                
            }
            
        }
        
        //Display A
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" \t"+ A[row][col]);
                
            }
            System.out.println("");
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 4 - 1 || j == 0 || j == 4 - 1) {
                    System.out.print(A[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
