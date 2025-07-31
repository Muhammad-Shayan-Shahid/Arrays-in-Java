/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_merge;
import java.util.*;
public class Array_Merge {
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
        int  [] Temp_array  = new int [size+len];
   
       for(int i=0; i<size;i++){
           Temp_array[i]=array1 [i];
       }
       
       for(int i=0; i<len ;i++){
           Temp_array[size+i]=array2 [i];
       }
        
        int  [] Extra_array  = new int [size+len];
        int count=0;
        for(int i=0; i<size+len;i++){
            boolean extra = false;
            for(int j=0; j<count;j++){
                if(Temp_array[i]==Extra_array[j]){
                extra = true;
                break;
                }
            }
            if(!extra){     
            Extra_array[count]=Temp_array[i];
            count++;
            }
        }
        
        int  [] Original_array  = new int [count];
        for(int i=0; i<count;i++){
            Original_array[i]=Extra_array[i];
        }
        
        System.out.println("Merge elements without repeat:"+Arrays.toString(Original_array));
    }
    
}
