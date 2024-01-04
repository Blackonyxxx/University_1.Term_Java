
package thevolcanocorollary;
import java.util.Scanner;

public class TheVolcanoCorollary {

    public static int puddle(int[] array,int n){
        int rmax,lmax,minvalue;

        int total=0;
        for (int i = 1; i < n-1; i++) {
            lmax =0;           
            rmax=0;
            for (int j = i-1; j > -1; j--) {
                if(array[j]>lmax)
                    lmax=array[j];
            }
            for (int j = i+1; j < n; j++) {
                if(array[j]>rmax)
                    rmax=array[j];
            }
            if(lmax<rmax)
                minvalue=lmax;
            else
                minvalue=rmax;
            if (minvalue-array[i]<0)
                continue;
            else
                total=total+(minvalue-array[i]);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("give n for line lenght ");
        int n = scn.nextInt();
        int[] array=new int[10];
        System.out.println("Enter "+ n+ " numbers representing the rock formations in the valley:");
        for (int i = 0; i < n; i++) {
        array[i]=scn.nextInt();
        }
        System.out.println("There can be maximum observable amount of hot lava is (in cells): "+ puddle(array,n));
        
    }
    
}
