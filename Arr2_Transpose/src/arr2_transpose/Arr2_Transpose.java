/*9
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr2_transpose;
import java.util.*;
public class Arr2_Transpose {
    public static int [][] transpose(int [][] matrix , int row , int col){
        int trans [][]= new int[col][row];
        for(int i=0; i<col ;i++){
            for(int j=0; j<row ;j++){
            trans [i][j]= matrix [j][i];
        } 
        }
        return trans;
    }
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
        System.out.println("Original Matrix :");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
               System.out.print(array [i][j]+" ");   
            }
               System.out.println();
        }
        int transpose [][] = transpose(array ,  row ,cols);
        System.out.println("Transpose of Matrix :");
        for(int i=0; i<cols; i++){
            for(int j=0; j<row; j++){
               System.out.print(transpose [i][j]+" ");   
            }
               System.out.println();
        }
    }
    
}
