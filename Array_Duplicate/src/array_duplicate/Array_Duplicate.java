/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_duplicate;
import java.util.*;
public class Array_Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array you want to print :");
        int size = input.nextInt();
        int  [] array  = new int [size];
        
        boolean duplicate;
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
        
        int  [] temp_array  = new int [size];
        
        int new_index=0;
        
        for(int i=0; i<size;i++){
            duplicate=false;
            for(int j=0; j<new_index;j++){
                if(array[i]==temp_array[j]){
                    duplicate=true;
                    break;
            }
    
            }
             if(!duplicate){
                   temp_array[new_index]=array[i];
                    new_index++;
            }
}
 
        int  [] final_array  = new int [new_index];
        for(int i=0; i<new_index;i++){
            final_array[i]=temp_array[i];
        }
        
        System.out.println("Without Duplicate Array :"+Arrays.toString(final_array));
    }
    
}
