/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagonal_array2;
import java.util.*;
public class Diagonal_Array2 {

     public static void DiagonalSum(int [][]arr){
         int sum = 0;
         for(int i=0; i<4; i++){
             for(int j=0; j<4;j++){
                 if(i==j){
                   sum+=arr [i][j];  
                 }
        }
             System.out.println("Sum of " +sum);
         }
     }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int  [][] array  = new int [4][4];
        
        for(int i=0; i<4; i++){
            System.out.println("Enter elements of array :"+(i+1));
            for(int j=0; j<4; j++){
                   array [i][j]  = input.nextInt();
        }
        }
        System.out.println("Elements of 2D array :");
         for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
               System.out.print(array [i][j]+" ");   
            }
               System.out.println();
        }
         DiagonalSum(array);
    }
    
}
