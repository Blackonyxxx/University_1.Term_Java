
package lab3_q3;
import java.util.Scanner;

public class Lab3_q3 {

   
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("cows: ");
        int cow=scn.nextInt();
        System.out.print("sheeps: ");
        int sheep=scn.nextInt();
        System.out.print("horses: ");
        int horse=scn.nextInt();
        
        double acow=360.0*cow/(cow+sheep+horse);
        double asheep=360.0*sheep/(cow+sheep+horse);
        double ahorse=360.0*horse/(cow+sheep+horse);
        
        System.out.printf("Angle of cows: %.2f",acow);
        System.out.printf("\nAngle of sheeps: %.2f",asheep);
        System.out.printf("\nAngle of horses: %.2f",ahorse);
        
    }
    
}
