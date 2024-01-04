
package lab2_q3;
import java.util.Scanner;

public class Lab2_q3 {

  
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=3, num2=5;
        
        System.out.print("Enter the 3rd number: ");
        int num3=scn.nextInt();
        System.out.print("Enter the 4th number: ");
        int num4=scn.nextInt();
        
        int sum=num1+num2+num3+num4;
        double average=sum/4.0;
        
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
        
        
        
    }
    
}
