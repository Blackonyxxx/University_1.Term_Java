
package lab5_q2;
import java.util.Scanner;

public class Lab5_q2 {

    public static void func2(int num){
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            
        }
    }
    public static void func(int num){
        for (int i = 1; i <= num; i++) 
            System.out.print(i);
    }
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=10;
        while(num<0||num>9){
        System.out.print("Enter a number (1-9 or non-positive to stop):");
        num=scn.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            func(i);
            func2(num-i);
            System.out.println("");
            
        }
      
    }
    
}
