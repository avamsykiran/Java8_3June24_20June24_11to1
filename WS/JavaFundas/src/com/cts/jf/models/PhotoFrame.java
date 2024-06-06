package com.cts.jf.models;

public interface PhotoFrame {

	double perimeter();
	
	default double estimateFramingCost(double framingRate) {
		return perimeter() * framingRate;
	}
}
