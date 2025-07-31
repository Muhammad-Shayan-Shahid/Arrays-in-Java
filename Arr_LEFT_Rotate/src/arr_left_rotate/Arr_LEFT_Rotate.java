/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr_left_rotate;
import java.util.*;
public class Arr_LEFT_Rotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array you want to print :");
        int size = input.nextInt();
        int  [] array  = new int [size];
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
        
        int  [] Rotated_array  = new int [size];
       for(int i=0 ; i<size-1 ; i++){
          Rotated_array[i]=array [i+1];
        }
       Rotated_array[size-1]=array [0];
       
       System.out.println("Rotated array :"+Arrays.toString(Rotated_array));
    }
    
}
