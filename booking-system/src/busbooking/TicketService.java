package busbooking;

import java.util.LinkedList;
import java.util.List;

public class TicketService {

	private static List<Ticket> allTickets = new LinkedList<>();
	
	
	public static void addNewTicket(int busNumber, List<Passenger> passengerList){
		int pnr = allTickets.size()+1;
		Bus bookedBus = BusService.findBus(busNumber); 
      	allTickets.add(new Ticket(pnr, bookedBus, passengerList));
        System.out.println("bus ticket booked succcesfully.");		
	}
	
	public static void showTicketDetail(int pnr) {
	      Ticket temp = null;
	      for(Ticket t : allTickets) {
	    	  if(t.getPnr()== pnr) {
	    		  temp = t;
	    		  break;
	    	  }
	      }
	      Bus tempBus = temp.getBookedBus();
	      List<Passenger> passengerList = temp.getPassengerList();
	      int totalFare=tempBus.getFare()* passengerList.size();
	      System.out.println("****** BOOKING DETILS************");		
	      System.out.println("pnr=>" + temp.getPnr() );		
	      System.out.println("bus number=>" + tempBus.getBusNumber() );		
	      System.out.println("from=>" +tempBus.getFromStation());		
	      System.out.println("to" + tempBus.getToStation());		
	      System.out.println("nme=>" + tempBus.getBusName());		
	      System.out.println("dte=>" +tempBus.getDate());		
	      System.out.println("fare=>" +tempBus.getFare());		
	      System.out.println("totalfare=>" +totalFare);		
		for(Passenger p : passengerList) {
			
			System.out.println(p.getPassengerName() +"/" +p.getAge());		
		}
	      System.out.println("***********************");		
	      System.out.println("***********************");		
	      System.out.println("***********************");		
		
	}
	
	

}
