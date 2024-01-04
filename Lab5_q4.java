package lab5_q4;

import java.util.Scanner;

public class Lab5_q4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[] prices = {6.5, 4.15, 3.50, 2.30, 3.45, 4.80, 8.10, 4.15, 3.10, 2.76};
        double[] sum = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the quantity of item " + (i + 1) + ": ");
            sum[i] = scn.nextDouble() * prices[i];
        }
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total = total + sum[i];

        }
        System.out.printf("Total Cost is %.1f \n", total);

    }

}
