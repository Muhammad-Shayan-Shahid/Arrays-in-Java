/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2_indices;
import java.util.*;
public class Array2_Indices {
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
        
       System.out.println("Enter elements of array you want to search :"); 
       int search= input.nextInt();
       boolean found = false;
       for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                   if(array [i][j]==search){
                       System.out.println("Elements found at index : [" +i+ "][" +j+ "]");
                       found = true;
                   }         
        }
       }
            if(!found){
                System.out.println("Elemnt not found");
            }
            
    }
    
}
