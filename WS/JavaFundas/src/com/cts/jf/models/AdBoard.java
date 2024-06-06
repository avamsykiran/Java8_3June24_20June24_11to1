package com.cts.jf.models;

public interface AdBoard {

	double area();
	
	public default double estimatePoaintingCost(double paintingRate) {
		return area() * paintingRate;
	}
}
