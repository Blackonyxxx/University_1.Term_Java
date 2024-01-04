
package bmı_calculator;
import java.util.Scanner;

public class BMI_Calculator {

  
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age=scn.nextInt();
        if(age<16)
            System.out.println("BMI for people 16 years or older  ");
        else{
        System.out.print("Plese write your weight(kg): ");
        double kg=scn.nextDouble();
        System.out.print("Plese write your height(m): ");
        double m=scn.nextDouble();
        
        double bmi=kg/(Math.pow(m, 2));
        
        if(bmi<18.5)
                System.out.println("you are underweight. ");
        else if(bmi<25.0)
                System.out.println("you are normal. ");
        else if(bmi<30.0)
                System.out.println("you are owerveight. ");
        else
                System.out.println("you are obese. ");
        
    }
    }
}
