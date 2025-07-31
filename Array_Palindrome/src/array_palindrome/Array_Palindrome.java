/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_palindrome;
import java.util.*;
public class Array_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array you want to print :");
        int size = input.nextInt();
        int  [] array  = new int [size];
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
        
        int  [] Reversed_array  = new int [size];
        for(int i=0 ; i<size ; i++){
            Reversed_array[i]=array [size-i-1];  
            
        }
        if(Arrays.equals(array, Reversed_array)){
           System.out.println("Yes, arrays are Palindrome :"); 
        }
        else{
           System.out.println("No, arrays are not Palindrome :"); 
        }
    }
    
}
