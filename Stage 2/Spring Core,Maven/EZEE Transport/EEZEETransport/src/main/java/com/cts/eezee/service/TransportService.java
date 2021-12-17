package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {
	private Vehicle vehicle;
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void registerBooking(Booking book) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer Name");
	    String name=sc.nextLine();
	    System.out.println("Enter the Mobile Number");
	    long mobile=Long.parseLong(sc.nextLine());
	    System.out.println("Enter the Destination");
	    String des=sc.nextLine();
	    System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
	    Date date=new SimpleDateFormat("dd-MM-yyyy").parse(sc.nextLine());
	    book.setCustomerName(name);
	    book.setMobileNumber(mobile);
	    book.setDestination(des);
		book.setDateOfJourney(date);
		calculateTravelCost(vehicle.getSource(), book.getDestination(),book.getDateOfJourney());	
	}
	public void calculateTravelCost(String source, String destination, Date doj) {
       if(checkAvailableDateForTravel(doj)) {
    	  System.out.println("Total Travel Cost is Rs. "+getCost(destination));
       }
       else {
    	 System.out.println("Invalid Travel Date");   
       }
	}
	
	public boolean checkAvailableDateForTravel(Date doj) {
		Date today=new Date();
		String todayString=new SimpleDateFormat("dd-MM-yyyy").format(today);
		String dojString=new SimpleDateFormat("dd-MM-yyyy").format(doj);
		Calendar cal=Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, 1);
		Date tomorrow=cal.getTime();
		String tomorrowDate=new SimpleDateFormat("dd-MM-yyyy").format(tomorrow);
		return dojString.equals(todayString) || dojString.equals(tomorrowDate);
	}
	public double getCost(String destination) {
      Map<String,Double> b=vehicle.getDestinationMap();
      return b.containsKey(destination)?b.get(destination):0.0;
	}
}
