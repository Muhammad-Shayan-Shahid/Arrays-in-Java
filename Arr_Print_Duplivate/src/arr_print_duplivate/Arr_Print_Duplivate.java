/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr_print_duplivate;
import java.util.*;
public class Arr_Print_Duplivate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array you want to print :");
        int size = input.nextInt();
        int  [] array  = new int [size];
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
 
        System.out.println("Dupliacte existance.");
         for(int i=0 ; i<size ; i++){
             boolean checked = false;
             
             for(int k=0; k<i ; k++){
                if(array [i]==array [k]){
                    checked = true;
                    break;
            } 
             }
              if(checked){
                    continue;
                }
            int count=0;
            for(int j=0 ; j<size ; j++){
            if(array [i]==array [j]){
                count++;
            }
        }
             if(count>1){
                System.out.println(array [i]);
            }
    }
    } 
}
