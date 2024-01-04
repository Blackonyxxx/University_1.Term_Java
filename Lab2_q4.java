
package lab2_q4;
import java.util.Scanner;

public class Lab2_q4 {

 
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Scanner scn2=new Scanner(System.in);
        char ch1,ch2;
        
        System.out.println("Enter tho double numbers: ");
        double num1=scn.nextDouble();
        double num2=scn.nextDouble();
        
        System.out.println("Enter 2 characters: ");
        ch1=scn2.next().charAt(0);
        ch2=scn2.next().charAt(0);
        
        double avg=(num1+num2)/2.0;
        
        System.out.printf("Avarage is: %.2f \n",avg);
        System.out.println("Two characters are: "+ch1+" and "+ch2);
        
        
        
        
        
        
    }
    
}
