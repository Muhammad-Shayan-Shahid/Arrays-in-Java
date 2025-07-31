/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sales_management;
import java.util.*;
public class Sales_Management {
    public static void totalSales(int [][]arr){
        int [] totalSales = new int[3];
        for(int i=0; i<3 ;i++){
            int sum=0;
           for(int j=0; j<7 ;j++){
               sum+= arr[i][j];
        }
           totalSales[i]=sum;
        }
        for(int i=0; i<3; i++){
            System.out.println("Total Sales for person "+(i+1)+" is : "+totalSales[i]);
        }
    }
    
    public static int [] maxSales(int [][]arr){
        int [] maxSales = new int [7];
        for(int j=0; j<7; j++){
            int largest = arr[0][j];
            for(int i=0; i<3; i++){
                if(largest < arr[i][j]){
                    largest = arr[i][j];
                }
            }
           maxSales[j] =largest;
        }
        return maxSales;
    }
    public static void main(String[] args) {
        System.out.println("------Sales Mangement System------");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int  [][] array  = new int [3][7];
        
        System.out.println("Enter weekly sales : ");
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.println("Sales for person "+(i+1));
            for(int j=0; j<7; j++){
                   array [i][j]  = input.nextInt();
        }
        }
        System.out.println("------Sales Mangement System------");
        System.out.println();
        System.out.println("Matrix representing Sales :");
         for(int i=0; i<3; i++){
            for(int j=0; j<7; j++){
               System.out.print(array [i][j]+" ");   
            }
               System.out.println();
        }
        totalSales(array);
        System.out.println("Maximum daily sale across all salespersons : "+Arrays.toString(maxSales(array)));
    }
    
}
