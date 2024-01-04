
package lab4_q2;
import java.util.Scanner;

public class Lab4_q2 {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter s string: ");
        String s=scn.nextLine();
        char cr=s.charAt(s.length()-1);
        
        System.out.print("The last character is "+cr);
        
        
        
    }
    
}
