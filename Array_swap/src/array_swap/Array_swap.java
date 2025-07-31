/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_swap;
import java.util.*;
public class Array_swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array you want to print :");
        int size = input.nextInt();
        int  [] array  = new int [size];
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
        int  [] New_array  = new int [size];
        for(int i=0 ; i<1 ; i++){
            New_array [i] = array [size-1];
        }
        for(int i=1 ; i<size-1 ; i++){
            New_array [i] = array [i];
        }
        for(int i=0 ; i<1 ; i++){
            New_array [size-1] = array [i];
        }
        
        System.out.println("Swapped Array :"+Arrays.toString(New_array));
    }
}



