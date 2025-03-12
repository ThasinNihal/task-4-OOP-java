
package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class Searchanelement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A= new int [2][3];
        
        
        //getting input for A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Enter A[%d][%d]=",row,col);
                A[row][col]= input.nextInt();
                
            }
            
        }
        
        //Display A
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t"+ A[row][col]);
                
            }
            System.out.println("");
            
        }
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();
        boolean found = false;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == target) {
                    System.out.println("Number found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the matrix.");
        }
        input.close();
    }
    
}
