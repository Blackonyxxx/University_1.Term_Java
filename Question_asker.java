
package question_asker;
import java.util.Scanner;

public class Question_asker {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        final int QNUM=5;
        int correctCount=0,count=0;
        long startTime=System.currentTimeMillis();
        
        while(count<QNUM){
            int num1=(int)(Math.random()*100);
            int num2=(int)(Math.random()*100);
            int q=num1+num2;
            System.out.println("What is "+num1+"+"+num2);
            int answer=scn.nextInt();
            if(answer==q)
                correctCount++;
            count++;
        }
        long endTime=System.currentTimeMillis();
        long testTime=(endTime-startTime)/1000;
        System.out.println("You gave "+correctCount+" correct answer");
        System.out.println("Your test time is: "+testTime+" sn");
        
        }
    }
    

