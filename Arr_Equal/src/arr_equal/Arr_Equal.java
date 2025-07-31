/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr_equal;
import java.util.*;
public class Arr_Equal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array 1 you want to print :");
        int size = input.nextInt();
        int  [] array1  = new int [size];
        
        System.out.println("Enter a elements if array 1:");
        for(int i=0 ; i<size ; i++){
            array1 [i] = input.nextInt();
        }
        
         System.out.println("Enter a length of array 2 you want to print :");
        int len = input.nextInt();
        int  [] array2  = new int [len];
        
        System.out.println("Enter a elements if array 2:");
        for(int i=0 ; i<len ; i++){
            array2 [i] = input.nextInt();
        }
        
        if(Arrays.equals(array1, array2)){
            System.out.println("Both arrays are equal.");
        }
        else{
            System.out.println("Both arrays are not equal.");
        }
    }
    
}
