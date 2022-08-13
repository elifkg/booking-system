package busbooking;

import java.time.LocalDate;

public class Bus {

	private int busNumber;
	private String busName;
	private String fromStation;
	private String toStation;
	private int seatIsavailable;
	private int fare;
	private LocalDate date;
	
	
	
	
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public int getSeatIsavailable() {
		return seatIsavailable;
	}
	public void setSeatIsavailable(int seatIsavailable) {
		this.seatIsavailable = seatIsavailable;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Bus(int busNumber, String busName, String fromStation, String toStation, int seatIsavailable, int fare,
			LocalDate date) {
		super();
		this.busNumber = busNumber;
		this.busName = busName;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.seatIsavailable = seatIsavailable;
		this.fare = fare;
		this.date = date;
	}
	}

