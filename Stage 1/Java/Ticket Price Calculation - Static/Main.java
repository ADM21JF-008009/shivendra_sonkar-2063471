import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int numberOfbooking=sc.nextInt();
        System.out.println("Enter the available tickets:");
       int numberTicket=sc.nextInt();
        Ticket t=new Ticket();
        t.setAvailableTickets(numberTicket);
        while(numberOfbooking-->0){
            System.out.println("Enter the ticketid:");
            int ticketid=sc.nextInt();
            t.setTicketid(ticketid);
            System.out.println("Enter the price:");
            int price=sc.nextInt();
            t.setPrice(price);
            System.out.println("Enter the no of tickets:");
            int numberOfTicket=sc.nextInt();
            System.out.println("Available tickets: "+t.getAvailableTickets());
            int y=t.calculateTicketCost(numberOfTicket);
            System.out.println("Total amount:"+y);
            if(y==-1){
                System.out.println("Available ticket after booking:"+t.getAvailableTickets());
            }else{
                System.out.println("Available ticket after booking:"+t.getAvailableTickets());
            }
        }
    }
}