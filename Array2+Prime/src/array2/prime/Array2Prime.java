/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2.prime;
import java.util.*;
public class Array2Prime {
    public static boolean isprime (int n){
        boolean prime = true;
        if(n==1){
            prime = false;
        }
        for(int i=2 ; i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        return prime;
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
        
        System.out.println("Prime numbers are :");
         for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                   if(isprime (array [i][j])==true){
                       System.out.println(array [i][j]);
                   }
        }
        }
    }
    
}
