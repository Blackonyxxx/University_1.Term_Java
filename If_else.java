
package if_else;
import java.util.Scanner;

public class If_else {

   
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    int num1=(int)(Math.random()*10);
    int num2=(int)(Math.random()*10);
    int result=Math.abs(num1-num2);
         
    
    if (num1>=num2){
        System.out.println(num1+" - "+num2+" =?");
        int answer=scn.nextInt();
            if(answer==result)
                System.out.println("Right Answer Congratulations!!!");
            else
                System.out.println("wrong answer, right answer is: "+result);
    }
    else {
        System.out.println(num2+" - "+num1+" =?");
        int answer=scn.nextInt();
            if(answer==result)
                System.out.println("Right Answer Congratulations!!!");
            else
                System.out.println("wrong answer, right answer is: "+result);
    }
    
}
}