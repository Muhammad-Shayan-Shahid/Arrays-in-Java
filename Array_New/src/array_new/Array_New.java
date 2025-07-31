/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_new;
import java.util.*;
public class Array_New {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter legnth 0f array :");
      int len = input.nextInt();
      
      int  [] array  = new int [len];
      
      System.out.println("Enter elements 0f array :");
        for(int i=0 ; i<len ; i++){
            array [i] = input.nextInt();
        }
        
        int  [] New_Array  = new int [len];
        for(int i=0 ; i<len ; i++){
            New_Array [i] = array [i];
        }
        System.out.println("Elements 0f New_Array without Array :"+Arrays.toString(New_Array));
    }
    
}
