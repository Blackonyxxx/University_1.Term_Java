
package lab4_q4;
import java.util.Scanner;

public class Lab4_q4 {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter a decimal number between 0 and 15: ");
        int num=scn.nextInt();
        
        if(0<num&&num<15){
            String bnr= Integer.toBinaryString(num);
            System.out.println("The binary number for "+num+" is "+bnr);
        }
        else
            System.out.println("this num is not between 0 and 15!!!");
        
        
    }
    
}
