/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_frequency;
import java.util.*;
public class Array_Frequency {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array you want to print :");
        int size = input.nextInt();
        int  [] array  = new int [size];
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
        
        boolean [] visited = new boolean[size];
         for(int i=0 ; i<size ; i++){
             int countF=0;
             if(visited[i]){
                 continue;
             }
            
            for(int j=0 ; j<size ; j++){
            if(array [i]==array [j]){
                countF++;
                visited[j]=true;
            }
        }
             System.out.println("Occurance of "+array [i]+" is : "+countF);
        }
     }
    
}
