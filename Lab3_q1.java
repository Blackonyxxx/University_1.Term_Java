
package lab3_q1;
import java.util.Scanner;

public class Lab3_q1 {

  
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("q: ");
        double q=scn.nextDouble();
        System.out.print("r: ");
        double r=scn.nextDouble();
        System.out.print("s: ");
        double s=scn.nextDouble();
        System.out.print("t: ");
        double t=scn.nextDouble();
        
        double res1=(Math.pow(Math.pow(q,3)+s, 4))/(Math.pow(t, 2.0/5));
        double res2=Math.sqrt(Math.abs((r*s)/(Math.pow(r, 3.0/2))));
        double result=Math.pow(res1+res2, 3);
        
        System.out.print("The result is: ");

        System.out.printf("%.1f",result);        
    }
    
}
