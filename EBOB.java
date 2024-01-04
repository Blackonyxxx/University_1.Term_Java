package ebob;

import java.util.Scanner;

public class EBOB {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two number: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int k = 1;
        int ebob = 0;
        while (k <= num1 && k <= num2) {
            if (num1%k == 0 && num2%k == 0) 
                ebob = k;
                k++;

        }
        System.out.println("ebob=" + ebob);
        
    }

}
