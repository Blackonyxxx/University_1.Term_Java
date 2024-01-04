
package lottery;
import java.util.Scanner;

public class Lottery {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=(int)(Math.random()*90)+10;
        System.out.println("Enter an two digit number: ");
        int b=scn.nextInt();
        
        if(b>99||b<10)
            System.out.println("İnvalid number!!!");
        else{
            int a1=a%10, a2=a/10;
            int b1=b%10, b2=b/10;
            
            if(a==b)
                System.out.println("You win a 10.000$ ");
            else if(a1==b2&&a2==b1)
                System.out.println("You win 3.000$ ");
            else if(a1==b1||a1==b2||a2==b1||a2==b2)
                System.out.println("You win 1.000$ ");
            else
                System.out.println("you lost");
            
             
                   
       
        
        
        
    }
    }
    
}
