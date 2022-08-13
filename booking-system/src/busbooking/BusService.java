package busbooking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class BusService {

	
	public BusService() {
		super();
	}

	private static LinkedList<Bus> allBuses = new LinkedList<>();
	
	static {
		allBuses.add(new Bus(1,"01","Ýstanbul","Sinop",400,300,LocalDate.now()));
		allBuses.add(new Bus(2,"02","Ýstanbul","Eskiþehir",300,200,LocalDate.now()));
		allBuses.add(new Bus(3,"03","Ýstanbul","Bursa",200,300,LocalDate.now()));
		allBuses.add(new Bus(4,"04","Ýstanbul","Samsun",250,300,LocalDate.now()));
	}
	
	public static Bus findBus(int busNumber) {
		Bus temp=null;
		for(Bus bus : allBuses) {
			if(bus.getBusNumber()==busNumber) {
				temp= bus;
				break;
			}
		}
		return temp;
	}
	
	
	public static void searchBus(String fromStation, String toStation, LocalDate date, int numOfSeats) {
	 List<Bus> searchBusList = new LinkedList<>();
		for(Bus b : allBuses) {
		   if(b.getFromStation().equals(fromStation)&&
				   b.getToStation().equals(toStation)&&
				   b.getDate().equals(date) && b.getSeatIsavailable()> numOfSeats) {
			   searchBusList.add(b);
	   }		
		}
		System.out.println();
		if(searchBusList.size()==0){
			System.out.println("bus you're looking for is not found.");
			
		}else {
			//System.out.println("BusNO\busnme\bFrom from\bTo to\dte\sets\fre");
		for(Bus b : searchBusList) {
			System.out.println();
			System.out.printf("%4d,%20s%15s%15s%12s%4d%5d",b.getBusNumber(),b.getBusNumber(),b.getFromStation(),b.getToStation(),b.getDate(),b.getSeatIsavailable(),b.getFare());
		}
		}
	}

   public static void bookTickets(int busNumber,List<Passenger> passengerList) {
	int numOfSeats = passengerList.size();
	Passenger tempPassenger = passengerList.get(0);
	BankAccount b1 = tempPassenger.getBankAccount();
	BankAccount b = passengerList.get(0).getBankAccount();
   
    Bus tempBus = findBus(busNumber);
    int fare = tempBus.getFare();
    int totalFare = fare* numOfSeats;
    
    b1.withdraw(totalFare);
    /////////////
    tempBus.setSeatIsavailable(tempBus.getSeatIsavailable()-numOfSeats);
    ///////
    TicketService.addNewTicket(busNumber, passengerList);
    
    
   }
	
		
		
	
	}
