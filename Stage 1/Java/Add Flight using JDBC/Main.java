import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem fl=new FlightManagementSystem();
        int flightId=sc.nextInt();
        String source=sc.nextLine();
        String destination=sc.nextLine();
        int noOfSeats=Integer.parseInt(sc.nextLine());
        double flightFare=Double.parseDouble(sc.nextLine());
        Flight f=new Flight(flightId,source,destination,noOfSeats,flightFare);
        if(fl.addFlight(f)){
          System.out.println("Flight details added successfully");   
        }else{
            System.out.println("Addition not done");
        }
    }
}