import java.util.*;
public class UserInterface {
   public static CommissionInfo generateCommissionObtained(){
         CommissionInfo com=(ticket)->{
             String st=ticket.getClassType();
             if(st.equalsIgnoreCase("1A") || st.equalsIgnoreCase("2A") || st.equalsIgnoreCase("3A")){
              return 100;
             }
             return 60;
         };
         return com;
   }
   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of passengers");
       int t=sc.nextInt();
       UserInterface us=new UserInterface();
       Ticket tc[]=new Ticket[t];
       for(int i=1;i<=t;i++){
           System.out.println("Details of Passenger "+i+":");
           System.out.println("Enter the pnr no:");
           long pnr=sc.nextLong();
           System.out.println("Enter passenger name:");
           String str=sc.next();
           System.out.println("Enter seat no:");
           int seat=sc.nextInt();
           System.out.println("Enter class type:");
           String type=sc.next();
           System.out.println("Enter ticket fare:");
           double db=sc.nextDouble();
           Ticket t1=new Ticket(pnr,str,seat,type,db);
           tc[i-1]=t1;
       }
       double sum=0;
       for(Ticket t1:tc){
          CommissionInfo con=us.generateCommissionObtained();
          double db=con.calculateCommissionAmount(t1);
          sum+=db;
       }
       System.out.println("Commission Obtained");
       System.out.printf("Commission obtained per each person: Rs.%.2f", sum);
    }
}