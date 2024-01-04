
package lab4_q1;
import java.util.Scanner;
public class Lab4_q1 {

   
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter an uppercase letter: ");
        char cr=scn.next().charAt(0);
        cr=Character.toUpperCase(cr);
        
        switch (cr) {
            case 'A', 'B', 'C' -> System.out.println("The corresponding number is 2");
            case 'D', 'E', 'F' -> System.out.println("The corresponding number is 3");
            case 'G', 'H', 'I' -> System.out.println("The corresponding number is 4");
            case 'J', 'K', 'L' -> System.out.println("The corresponding number is 5");
            case 'M', 'N', 'O' -> System.out.println("The corresponding number is 6");
            case 'P', 'Q', 'R', 'S' -> System.out.println("The corresponding number is 7");
            case 'T', 'U', 'V' -> System.out.println("The corresponding number is 8");
            case 'W', 'X', 'Y', 'Z' -> System.out.println("The corresponding number is 9");
            default -> System.out.println("Invalid input!!!");
        }

           
    }
    
}
