package com.cts.jf.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.jf.models.Bus;

public class ReservationService implements Runnable {

	private Bus bus;
	private int seatsNeeded;
	private List<Integer> reservedSeats;
	
	public ReservationService(Bus bus, int seatsNeeded) {
		super();
		this.bus = bus;
		this.seatsNeeded = seatsNeeded;
		this.reservedSeats = new ArrayList<>();
	}

	@Override
	public void run() {
		for(int i=1;i<=seatsNeeded && isSeatAvailable();i++) {			
			synchronized (bus) {
				int seat = bus.getLastReservedSeat() + 1;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.reservedSeats.add(seat);
				bus.setLastReservedSeat(seat);	
			}
			
		}
	}
	
	private boolean isSeatAvailable() {
		return bus.getLastReservedSeat()!=bus.getSeatsCount();
	}

	public List<Integer> getReservedSeats() {
		return reservedSeats;
	}
	
}
