package com.cts.jf;

import com.cts.jf.models.CircularBoard;
import com.cts.jf.models.RectangularBoard;

public class App02InterfacesUsage {

	public static void main(String[] args) {
		
		RectangularBoard rb = new RectangularBoard(10,10);
		CircularBoard cb = new CircularBoard(10);
		
		System.out.println(rb.estimatePoaintingCost(5));
		System.out.println(rb.estimateFramingCost(3));
		
		System.out.println("----------------------------------------------");
		
		System.out.println(cb.estimatePoaintingCost(5));
		System.out.println(cb.estimateFramingCost(3));
		
		System.out.println("----------------------------------------------");
		
	}

}
 