/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2_basic;
import java.util.*;
public class Array2_Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and columns in array :");
        int row = input.nextInt();
        int cols = input.nextInt();
        int  [][] array  = new int [row][cols];
        
        for(int i=0; i<row; i++){
            System.out.println("Enter elements of row :"+(i+1));
            for(int j=0; j<cols; j++){
                   array [i][j]  = input.nextInt();
        }
        }
        //OUTPUT:::::
        System.out.println("Elemats of 2D array :");
         for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
               System.out.print(array [i][j]+" ");   
            }
               System.out.println();
        }
         
          for(int i=0; i<row; i++){
              int sum=0;
            for(int j=0; j<cols; j++){
               sum+=  array [i][j];
        }
            System.out.println("Sum of row "+(i+1)+" is :"+sum);
            sum=0;
    }
    }
}
