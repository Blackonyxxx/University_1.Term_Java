
package lab3_q4;
import java.util.Scanner;

public class Lab3_q4 {

 
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("x1: ");
        double x1=scn.nextDouble();
        System.out.print("y1: ");
        double y1=scn.nextDouble();
        System.out.print("x2: ");
        double x2=scn.nextDouble();
        System.out.print("y2: ");
        double y2=scn.nextDouble();
        
        double a=Math.pow(x1-x2,2),b=Math.pow(y1-y2,2);
        double distance=Math.pow(a+b,1.0/2);
        System.out.printf("\ndistance is: %.3f",distance);
        
        
        
    }
    
}
