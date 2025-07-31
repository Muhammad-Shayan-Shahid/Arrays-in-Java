/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr2_diagonalmultiply;
import java.util.*;
public class Arr2_DiagonalMultiply {
     public static int diagonalMultiply(int [][] arr , int row ,int col){
        int multiply = 1;
        for(int i=0; i<col ;i++){
            for(int j=0; j<row ;j++){
            if(i==j){
                multiply *=arr [i][j];
            }
        } 
    }
        return multiply;
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and columns in array :");
        int row = input.nextInt();
        int cols = input.nextInt();
        int  [][] array  = new int [row][cols];
        
        for(int i=0; i<row; i++){
            System.out.println("Enter elements of array :"+(i+1));
            for(int j=0; j<cols; j++){
                   array [i][j]  = input.nextInt();
        }
        }
        System.out.println("Product of Diagonal :"+diagonalMultiply(array ,row ,cols));
    }
  
}
