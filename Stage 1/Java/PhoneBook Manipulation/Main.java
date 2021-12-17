import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PhoneBook ph=new PhoneBook();
        while(true){
         System.out.println("Menu");
         System.out.println("1.Add Contact");
         System.out.println("2.Display all contacts");
         System.out.println("3.Search contact by phone");
         System.out.println("4.Remove contact");
         System.out.println("5.Exit");
         System.out.print("Enter your choice: ");
         int select=Integer.parseInt(sc.nextLine());
         System.out.println(select);
         if(select==5){
             break;
         }
         else if(select==1){
             System.out.println("Add a Contact:");
             System.out.println("Enter the First Name: ");
             String name=sc.nextLine();
             System.out.println("Enter the Last Name: ");
             String last=sc.nextLine();
             System.out.println("Enter the Phone No.: ");
             long phone=Long.parseLong(sc.nextLine());
             System.out.println("Enter the Email: ");
             String em=sc.nextLine();
             Contact con=new Contact(name,last,phone,em);
             ph.addContact(con);
         }
         else if(select==2){
             System.out.println("The contacts in the List are:");
             List<Contact> li=ph.viewAllContacts();
             for(Contact con:li){
                 System.out.println("First Name: "+con.getFirstName());
                 System.out.println("Last Name: "+con.getLastName());
                 System.out.println("Phone No.: "+con.getPhoneNumber());
                 System.out.println("Email: "+con.getEmailId());
             }
         }
         else if(select==3){
             long num=Long.parseLong(sc.nextLine());
             System.out.println("Enter the Phone number to search contact:");
             Contact con=ph.viewContactGivenPhone(num);
             if(con!=null){
              System.out.println("First Name: "+con.getFirstName());
                 System.out.println("Last Name: "+con.getLastName());
                 System.out.println("Phone No.: "+con.getPhoneNumber());
                 System.out.println("Email: "+con.getEmailId());
             }
         }else if(select==4){
             System.out.println("Enter the Phone number to remove :");
             long num=Long.parseLong(sc.nextLine());
             System.out.println("Do you want to remove the contact (Y/N):");
             String option=sc.nextLine();
             if(option.startsWith("Y") || option.startsWith("y")){
                 boolean isromove=ph.removeContact(num);
                 if(isromove){
                     System.out.println("The contact is successfully deleted.");
                 }
             }else if(option.startsWith("N") || option.startsWith("n")){
                 
             }else{
                 
             }
             
         }
        }
    }
}