/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author arif0
 */
public class Bubblesort {

    public static void bubblesort(int[] arr, int n ){
        if (n==1)
            return;
        int count=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count++;
            }
           
        }
         if (count==0)
                 return;
        bubblesort(arr,n-1);
                    
    }
    public static void main(String[] args) {
        int[] arr={60,39,75,13,49,55};
        bubblesort(arr, arr.length);
        System.out.println(Arrays.toString(arr)); 
    }
    
}
