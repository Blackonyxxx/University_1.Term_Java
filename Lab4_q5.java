
package lab4_q5;
import java.util.Scanner;

public class Lab4_q5 {

   
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter the size of a shelf: ");
        int size=scn.nextInt();
        System.out.print("Enter total number of books:");
        int book=scn.nextInt();
        System.out.print("Enter total number of bookstands: ");
        int stand=scn.nextInt();
        
        int space=size*3*stand;
        
        if(space>book){
            int a=space-book;
            System.out.println("Bookstand can be store "+a+" more book.");
        }else if(book>space){
            int a=book-space;
            int b=a/(3*size);
            System.out.println("There is/are "+b+" bookstand(s) is/are needed.");
        }else
            System.out.println("There is/are enough bookstand(s) to store "+book+" books.");
       
    }
        
        
    }
    

