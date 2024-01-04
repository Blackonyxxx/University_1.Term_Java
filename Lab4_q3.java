
package lab4_q3;
import java.util.Scanner;

public class Lab4_q3 {

  
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter a four-digit binary string: ");
        String s=scn.nextLine();
        
        int d1=s.charAt(3)-'0';
        int d2=s.charAt(2)-'0';
        int d3=s.charAt(1)-'0';
        int d4=s.charAt(0)-'0';
        
        int decimal= d1*1+d2*2+d3*4+d4*8;
        
        System.out.println("The decimal number for "+s+" is "+decimal);
       
        
    }
    
}
