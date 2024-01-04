
package lab3_q2;
import java.util.Scanner;

public class Lab3_q2 {

   
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter a binary: ");
        int binary=scn.nextInt();
        
        int d1= binary%10;
         binary=binary/10;
        int d2= binary%10;
         binary=binary/10;
        int d3= binary%10;
         binary=binary/10;
        int d4= binary%10;
         binary=binary/10;
        int d5= binary%10;
        
        int equ = d1+d2*2+d3*4+d4*8+d5*16;
        int s1=equ%10;
        int equ1= equ/10;
        int s2=equ1%10;
        int sum= s1+s2;
        
        System.out.println("equivalent is "+equ+" and sum is "+sum);
        
    }
    
}
