/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr_unique_check;
import java.util.*;
public class Arr_Unique_CHeck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of array you want to print :");
        int size = input.nextInt();
        int  [] array  = new int [size];
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
        
        boolean unique = true;
         for(int i=0 ; i<size ; i++){
             
             for(int k=i+1; k<size ; k++){
                if(array [i]==array [k]){
                    unique = false;
                    break;
            } 
    }
             
         }
           if(unique){
                 System.out.println("Elemnets are unique.");
             }
             else{
                 System.out.println("Elemnets are not unique.");
             }
    }
}
