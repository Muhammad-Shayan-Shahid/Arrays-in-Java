/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10task2;
import java.util.*;
public class LAb10Task2 {
    public static boolean isPrime(int n){ 
        boolean prime = true;
        if(n==1){
            prime = true;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
            prime = false;
        }
        }
        return prime;
    }
    public static void cols(int [][]arr){ 
            int largest_count =0;
            int cols = 0;
        for(int j=0; j<4; j++){
            int count = 0;
            for(int i=0; i<3; i++){
                if(isPrime(arr [i][j])==true){
                    count++;
                }
            }
            if(count>largest_count){
                largest_count=count;
                cols = j;
            }
        }
        System.out.println("Maximum prime number are in column : "+ (cols+1) + " and their frequency is : "+largest_count);
    }
    public static void row(int [][]arr){
            int largest_count =0;
            int row = 0;
        for(int i=0; i<3; i++){
            int count = 0;
            for(int j=0; j<4; j++){
                if(isPrime(arr [i][j])==true){
                    count++;
                }
            }
            if(count>largest_count){
                largest_count=count;
                row = i;
            }
        }
        System.out.println("Maximum prime number are in row : "+ (row+1) + " and their frequency is : "+largest_count);
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
        System.out.println("Elements of 2D array :");
         for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
               System.out.print(array [i][j]+" ");   
            }
               System.out.println();
        }
        row(array);
        cols(array);
    }
    
}
