package palindrom;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int low = 0;
        int high = s.length() - 1;
        boolean p = true;
        while (low < high) {
            if (s.charAt(low)!=s.charAt(high)) {
                p = false;
                break;
            }
            low++;
            high--;
        }
        if (p) {
            System.out.println("this word is palindrom");
        } else {
            System.out.println("tis word is not palindrom");
        }
    }

}
