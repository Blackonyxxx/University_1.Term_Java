
package lab3_q5;
import java.util.Scanner;

public class Lab3_q5 {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("pc: ");
        int pc=scn.nextInt();
        System.out.print("camera: ");
        int cam=scn.nextInt();
        System.out.print("cell phone: ");
        int phn=scn.nextInt();
        System.out.print("budget: ");
        int budget=scn.nextInt();
        
        int apc=budget/pc;
        int acam=budget/cam;
        int aphn=budget/phn;
        int bpc=budget-apc*pc;
        int bcam=budget-acam*cam;
        int bphn=budget-aphn*phn;
        
        System.out.println("you can buy "+apc+" pc and "+bpc+" will remain");
        System.out.println("you can buy "+acam+" cam and "+bcam+" will remain");
        System.out.println("you can buy "+aphn+" cell phone and "+bphn+" will remain");
        
        
        
    }
    
}
