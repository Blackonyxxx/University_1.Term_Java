
package decimaltohex;
import java.util.Scanner;

public class DecimalToHex {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a decimal number: ");
        int decimal=scn.nextInt();
        String hex="";
        
        while(decimal!=0){
            int hexValue=decimal%16;
            
            char hexDigit=(hexValue>=0&&hexValue<=9)? (char)(hexValue+'0'):(char)(hexValue-10+'a');
            hex=hexDigit+hex;
            decimal=decimal/16;
        }
        System.out.println(hex);
        System.out.println(Integer.toHexString(123));
    }
    
}
