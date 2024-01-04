package lab2_q2;

import java.util.Scanner;

public class Lab2_q2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("a: ");
        int a = scn.nextInt();
        System.out.print("b: ");
        int b = scn.nextInt();
        System.out.print("c: ");
        int c = scn.nextInt();
        System.out.print("e: ");
        double e = scn.nextDouble();
        System.out.print("t: ");
        double t = scn.nextDouble();

        double result = (a + ((c + (1 / e)) / (b * t / a))) / ((c * e) / ((b + 1) / b));
        
        System.out.print("result is: ");
        System.out.printf("%.3f",result);

    }

}
