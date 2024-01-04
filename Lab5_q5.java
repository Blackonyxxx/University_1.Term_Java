
package lab5_q5;
import java.util.Scanner;
public class Lab5_q5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String str=scn.nextLine();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)==' '&&str.charAt(i+1)==' ')
                i++;
            System.out.print(str.charAt(i));

        }
        System.out.println("");
        
    }
    
}
