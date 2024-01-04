//Arif Şevki Yılmaz
//Id:22050111043
package arif_sevki_yılmaz_task3;
import java.util.Scanner;
public class Arif_Sevki_Yılmaz_Task3 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int[][] array=new int[n][n];
        for (int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                array[i][k]=scn.nextInt();
            }
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1=sum1+array[i][i];
        }
        int sum2=0;
        int k=n-1;
        for(int i=0;i<n;i++){
            
                sum2=sum2+array[i][k];
                k--;
            }
       
        System.out.println(Math.abs(sum2-sum1));
        
    
}
}