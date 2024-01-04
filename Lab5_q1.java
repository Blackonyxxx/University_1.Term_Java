
package lab5_q1;
import java.util.Scanner;
public class Lab5_q1 {
    
    public static int sumEven(int n){
        int sum=0;
        for (int i = 0; i <= n; i+=2) 
            sum=sum+i;
        return sum;
    }
        public static int sumOdd(int n){
        int sum=0;
        for (int i = 1; i <= n; i+=2) 
            sum=sum+i;
        return sum;
    }
    public static int factorial (int n){
        int k=1;
        for (int i = 1; i <= n; i++) 
        k=k*i;
        return k;
    }
    public static int func(int n){
        if (n<=0)
            return (int) ((Math.pow(n, 5))+(factorial(Math.abs(n))));
        else if (1<=n&&n<10)
            return factorial(n)-120;
        else if(n>=10&&n%2==0)
            return sumEven(n);
                else if(n>=10&&n%2!=0)
            return sumOdd(n);
        return 0;
    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int n=-10;
        while(n<-5){
        System.out.print("Enter n (>=-5)");
        n=scn.nextInt();
        }
        int sum=0;
        for (int i = -5; i <= n; i++) 
           sum=sum+func(i);
        System.out.println("Result of the calculation: "+sum);
        
        
        
    }
}
