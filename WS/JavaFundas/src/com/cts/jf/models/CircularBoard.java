package com.cts.jf.models;

import java.util.Objects;

public class CircularBoard implements AdBoard,PhotoFrame {

	private int radius;
	
	public CircularBoard() {
		//left blank
	}

	public CircularBoard(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CircularBoard other = (CircularBoard) obj;
		return radius == other.radius;
	}

	@Override
	public String toString() {
		return "CircularBoard [radius=" + radius + "]";
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	
}
