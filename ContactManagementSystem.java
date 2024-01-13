
package contactmanagementsystem;
import java.util.Scanner ;
public class ContactManagementSystem {

    public static void update(String[] names, String[] phones, String[] mails) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number or mail address: ");
    String check = scn.nextLine();
    int index = indexSearch(names, phones, mails, check);

    if (index > -1) {
        System.out.println("Enter updated information:");
        System.out.print("Name: ");
        names[index] = scn.nextLine();
        System.out.print("Phone Number: ");
        phones[index] = scn.nextLine();
        System.out.print("Mail Address: ");
        mails[index] = scn.nextLine();
        System.out.println("Contact updated successfully.");
    } else {
        System.out.println("No matching entry found.");
    }
}
    public static int indexSearch(String[] names,String[] phones, String[] mails,String check){
        int result = -1;

        for (int j = 0; j < mails.length; j++) {
            if (mails[j] == null)
             break;

            if (check.equals(mails[j]) || check.equals(phones[j])) {
             result = j;
             break;
        }
    }return result;
    }
    public static void delete(String[] names,String[] phones, String[] mails){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a name or mail adress ");
        String check = scn.nextLine();
        int index=indexSearch(names,phones,mails,check);
        if(index>-1){
            names[index]=null;
            mails[index]=null;
            phones[index]=null;
            System.out.println("Contact deleted successfully.");
            
        }
        else{
            System.out.println("No matching entry found.");
            delete(names,phones,mails);
        }

    }
    public static void search(String[] names,String[] phones, String[] mails){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a name or mail adress ");
        String check = scn.nextLine();
        int result = -1;

        for (int j = 0; j < mails.length; j++) {
            if (mails[j] == null)
             continue;

            if (check.equals(mails[j]) || check.equals(phones[j])) {
             result = j;
             break;
        }
           
    }

        if (result > -1) {
         System.out.println("Name: " + names[result] + ", Phone Number: " + phones[result] + ", Mail: " + mails[result]);
    }   else {
         System.out.println("No matching entry found.");
            }                             
        }
    
    public static void bubbleSortStr(String[] names,String[] phones, String[] mails){
        String temp;
        for (int j = 0; j < names.length; j++) {
   	   for (int i = j + 1; i < names.length; i++) {
               if(names[i]==null){
                continue;
               }
               else if (names[i] != null && names[j] != null && names[i].compareTo(names[j]) < 0) {
			temp = names[j];
			names[j] = names[i];
			names[i] = temp;
                        temp = phones[j];
			phones[j] = phones[i];
			phones[i] = temp;
                        temp = mails[j];
			mails[j] = mails[i];
			mails[i] = temp;
    }
           }
        }
    }
    public static void displayContacts(String[] names,String[] phones, String[] mails ){
        for (int i = 0; i < names.length; i++) {
            bubbleSortStr(names,phones,mails);
            if(names[i]==null)
                continue;
            else{
                System.out.print("Name: "+names[i]+ ", Phone Number: "+phones[i]+", Mail: "+mails[i]);
                System.out.println("");
            }
            
        }
    }
    public static void add(String[] names,String[] phones, String[] mails ,int n){
        Scanner scn=new Scanner(System.in);
        System.out.println("write contact informations");
        System.out.print("Name: ");
        String name=scn.nextLine();
        System.out.print("Phone Number: ");
        String phone=scn.nextLine();
        System.out.print("Mail Adress: ");
        String mail=scn.nextLine();
        names[n]=name;
        phones[n]=phone;
        mails[n]=mail;
        System.out.println("Contact added successfully.");
    }
    public static void displayMenu(){
        System.out.println("write 'add' to add a new contact");
        System.out.println("write 'display' to display all contacts");
        System.out.println("write 'search' to search a contact");
        System.out.println("write 'delete' to delete a contact");
        System.out.println("write 'update' to update a contact");
        System.out.println("write 'exit' to end the program");
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        //for array lenght
        final int listLenght=10;
        int addCounter=2;
        
        //our contact arrays
        String[] names =new String[listLenght];
        String[] phones =new String[listLenght];
        String[] mails =new String[listLenght];
        
        //for check
        names[0]="arif";
        names[1]="berat";
        phones[0]="553855";
        phones[1]="888554";
        mails[0]="arif@mail.com";
        mails[1]="berat@mail.com";
        
        //main code loop
        while(true){
            //list the options
            displayMenu();
            
            System.out.println("Choose an operation:");
            String operation=scn.nextLine();
            
            //execute the operation
            if (operation.equals("add")){
                if (addCounter>=listLenght){
                    System.out.println("You are at maximum contact limit");
                    continue;
                }
                else{
                    add(names,phones,mails,addCounter);
                    addCounter++;
                }
            }
            else if (operation.equals("display")){
                displayContacts(names,phones,mails);
            }
            else if (operation.equals("search")){
                search(names,phones,mails);
            }
            else if (operation.equals("delete")){
                delete(names,phones,mails);
                addCounter--;
            }
            else if (operation.equals("update")) {
                update(names, phones, mails);
            }
            else if (operation.equals("exit")){
                break;
            }
            else
                System.out.println("İnvalid Operation!!!");
            
        }
        
        
    }
    
    }
