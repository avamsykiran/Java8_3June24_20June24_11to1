package com.cts.jf.models;

import java.util.Objects;

public class RectangularBoard implements AdBoard,PhotoFrame {

	private int length;
	private int breadth;
	
	public RectangularBoard() {
		//left blank
	}

	public RectangularBoard(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadth, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RectangularBoard other = (RectangularBoard) obj;
		return breadth == other.breadth && length == other.length;
	}

	@Override
	public String toString() {
		return "RectangularBoard [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	public double area() {
		return length*breadth;
	}

	@Override
	public double perimeter() {
		return 2*(length+breadth);
	}
}
