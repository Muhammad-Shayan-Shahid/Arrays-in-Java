/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10task1;
import java.util.*;
public class LargestSum {
    public static void rowSum(int [][]arr){
        int sum = 0;
        int largest =0;
        int row=0;
         for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                sum+=arr [i][j];
        }
            if(sum>largest){
                largest=sum;
                row = i+1;
            }
            sum=0;
         }
         System.out.println("Largest sum belongs to row :"+row+" and sum is : "+largest);
    }
     public static void ColsSum(int [][]arr){
        int sum = 0;
        int largest =0;
        int col=0;
         for(int j=0; j<4; j++){
            for(int i=0; i<3; i++){
                sum+=arr [i][j];
        }
            if(sum>largest){
                largest=sum;
                col = j+1;
            }
            sum=0;
         }
         System.out.println("Largest sum belongs to column :"+col+" and sum is : "+largest);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  [][] array  = new int [3][4];
        
        for(int i=0; i<3; i++){
            System.out.println("Enter elements of array :"+(i+1));
            for(int j=0; j<4; j++){
                   array [i][j]  = input.nextInt();
        }
        }
        rowSum(array);
        ColsSum(array);
    }
    
}
