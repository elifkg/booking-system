package busbooking;

import java.util.List;

public class Ticket {

	
	private int pnr;
	private Bus bookedBus;
	private List<Passenger> passengerList;
	public Ticket(int pnr, Bus bookedBus, List<Passenger> passengerList) {
		super();
		this.pnr = pnr;
		this.bookedBus = bookedBus;
		this.passengerList = passengerList;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public Bus getBookedBus() {
		return bookedBus;
	}
	public void setBookedBus(Bus bookedBus) {
		this.bookedBus = bookedBus;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	} 
}
