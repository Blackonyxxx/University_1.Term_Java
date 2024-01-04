package lab2_q1;

import java.util.Scanner;

public class Lab2_q1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scn.nextInt();

        int sum = num1 + num2, dif = num1 - num2, mul = num1 * num2;

        System.out.println("the sum is: " + sum);
        System.out.println("the diffirence is: " + dif);
        System.out.println("the product is: " + mul);

    }

}
