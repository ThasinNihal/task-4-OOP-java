
package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A= new int [3][3];
        
        
        //getting input for A matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Enter A[%d][%d]=",row,col);
                A[row][col]= input.nextInt();
                
            }
            
        }
        
        //Display A
        for (int row = 0; row < 3 ;row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t"+ A[row][col]);
                
            }
            System.out.println("");
            
        }
        

        // Initialize a flag to check symmetry
        boolean isSymmetric = true;

        // Check symmetry
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != A[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric){
                break;
            }
        }

        // Print the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
    
}
