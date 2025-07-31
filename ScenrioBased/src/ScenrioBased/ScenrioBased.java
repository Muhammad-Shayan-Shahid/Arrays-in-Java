/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8_activity4;
import java.util.*;
public class ScenrioBased{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Select your choice (1-4) :");
        System.out.println("1. Input and display elements of array ");
        System.out.println("2  Search element in an array");
        System.out.println("3. Print Largest and Smallest of array :");
        System.out.println("4. Copy elements in another array ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:{
                int A[] = new int [10];
                int [] array = (input(A));
                display(array);
                break;
            }
            case 2:{
                System.out.println("Enter elements you want to search: ");
                int search = input.nextInt();
                int A[] = new int [10];
                int [] array = (input(A));
                search(search,array);
                break;
            }
            case 3:{
                int A[] = new int [10];
                int [] array = (input(A));
                Largest(array);
                Smallest(array);
                break;
            }
            case 4:{
                 int A[] = new int [10];
                int [] array = (input(A));
                int Copied [] = new int [10];
                copydata(array, Copied);
                break;
            }
            default:
               System.out.println("Inavlid Choice!!!!");
        }
    }
    //Part(a):
    public static int [] input(int array[]){ 
        int [] arr = new int [10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of array :");
        for(int i=0 ; i<10 ; i++){
            arr [i] = input.nextInt();
        }
        return arr;
    }
    //Part(a):
    public static void display(int A []){
        for(int i=0; i<A.length; i++){
            System.out.println("A[ " +i+ " ] is : "+A[i]);
        }
    }
    
    //Part(b):
    public static void search(int searchkey, int Array[]){
        boolean found  = false;
        
        for(int i=0 ; i<Array.length; i++){
            if(Array[i]==searchkey){
                System.out.println("Element found at { "+i+" ] is : " + Array[i]);
                found  = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element does not exist.");
        }
    }
    
    //Part(c):
    public static void Largest(int Array[]){
        int largest = Array[0];
        
        for(int i=1; i<Array.length;i++){
            if(Array[i]>largest){
                largest=Array[i];
            }
        }
        System.out.println("Largest element is : "+largest);
    }
    
    //Part(c):
    public static void Smallest(int Array[]){
        int Smallest = Array[9];
        
        for(int i=0; i<Array.length;i++){
            if(Array[i]<Smallest){
                Smallest=Array[i];
            }
        }
        System.out.println("Smallest element is : "+Smallest);
    }
    
   //Part(d):
    public static void copydata(int Array[], int copiedArray[]){
        for(int i=0; i<10 ; i++){
            copiedArray[i]=Array[i];
        }
        
        System.out.println("Copied Array : ");
         for(int i=0; i<10 ; i++){
            System.out.println("Copied Array[ " +i+ " ] is : "+copiedArray[i]);
        }
    }
}
