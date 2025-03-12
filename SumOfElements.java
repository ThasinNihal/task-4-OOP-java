

package com.mycompany.versitywork.Task4;

import java.util.Scanner;


public class SumOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A= new int [2][3];
        int sum=0;
        
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
        
        //Sum of all elements
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                sum+= A[row][col];
                        
                
            }
            
        }
        System.out.println("The sum of all elements in matrix A: "+sum);
        
        
    }
    
}

