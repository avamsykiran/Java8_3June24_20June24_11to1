package com.cts.jf.models;

import java.util.Objects;

public class Bus {

	private int seatsCount;
	private int lastReservedSeat;
	
	public Bus(int seatsCount) {
		super();
		this.seatsCount = seatsCount;
		this.lastReservedSeat=0;
	}

	public int getLastReservedSeat() {
		return lastReservedSeat;
	}

	public void setLastReservedSeat(int lastReservedSeat) {
		this.lastReservedSeat = lastReservedSeat;
	}

	public int getSeatsCount() {
		return seatsCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastReservedSeat, seatsCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return lastReservedSeat == other.lastReservedSeat && seatsCount == other.seatsCount;
	}

	@Override
	public String toString() {
		return "Bus [seatsCount=" + seatsCount + ", lastReservedSeat=" + lastReservedSeat + "]";
	}
	
}
