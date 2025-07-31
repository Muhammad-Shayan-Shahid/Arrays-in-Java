/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10task3;
import java.util.*;
public class MatrixMultiplication {
    public static void matrixMuitiplication(int [][] a1 ,int [][] a2){
        int  [][] multiply  = new int [3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                   int sum=0;
                for(int k=0; k<4; k++){
                    sum+= a1[i][k]*a2[k][j];
        }
                 multiply[i][j]=sum;
        }
        }
        System.out.println("Multiplied Matrix :");
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               System.out.print(multiply [i][j]+" ");   
            }
               System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int  [][] array1  = new int [3][4];
        int  [][] array2  = new int [4][3];
        
        System.out.println("Elements for Matrix 1 :");
        for(int i=0; i<3; i++){
            System.out.println("Enter elements of array :"+(i+1));
            for(int j=0; j<4; j++){
                   array1 [i][j]  = input.nextInt();
        }
        }
        
        System.out.println("Elements for Matrix 2 :");
        for(int i=0; i<4; i++){
            System.out.println("Enter elements of array :"+(i+1));
            for(int j=0; j<3; j++){
                   array2 [i][j]  = input.nextInt();
        }
        }
        
        System.out.println("Matrix1 :");
         for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
               System.out.print(array1 [i][j]+" ");   
            }
               System.out.println();
        }
         
         System.out.println("Matrix2 :");
         for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
               System.out.print(array2 [i][j]+" ");   
            }
               System.out.println();
        }
         matrixMuitiplication(array1 ,array2);
    }
    
}
