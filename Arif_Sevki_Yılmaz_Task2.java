//Arif Şevki Yılmaz
//Id:22050111043
package arif_sevki_yılmaz_task2;
import java.util.Scanner;

public class Arif_Sevki_Yılmaz_Task2 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter the year (K) :");
        int k=scn.nextInt();
        int d;
        do{
        System.out.print("Enter the day (D) :");
        d =scn.nextInt();
        }while(d<=0||d>366);
        int m = 1;
        int[] leap={31,29,31,30,31,30,31,31,30,31,30,31};
        int[] notLeap={31,28,31,30,31,30,31,31,30,31,30,31};
        
            if((k>=1919&&k%4==0)||(k<1919&&(k%400==0||(k%4==0&&k%100!=0)))){
                for(int i=0;d>31;i++){
                    d=d-leap[i];
                    m++;
                }
                System.out.printf("%02d.%02d.%d", d, m, k);
            }else{
                for(int i=0;d>31;i++){
                    d=d-notLeap[i];
                    m++;
                }
                System.out.printf("%02d.%02d.%d", d, m, k);
            }
                
    }
}