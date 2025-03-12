package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class transposeofaMatrix {
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
        System.out.println("A:\t");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                System.out.print(" \t"+ A[row][col]);
                
            }
            System.out.println("");
            
        }
        int transpose[][] = new int[3][2];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                transpose[col][row] = A[row][col];
                
            }
            
        }
        //display transpose
        System.out.println("transpose:\t");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                
                System.out.print(" \t"+ transpose[row][col]);
                
            }
            System.out.println("");
            
        }
        
    }
    
}
