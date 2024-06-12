package com.cts.jf;

import java.time.LocalTime;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class App13FunctionPackage {

	public static void main(String[] args) {

		Consumer<Object> c1 = System.out::println; //Method Referencing
		c1.accept("Hello Everybody");
		
		Supplier<String> orgTitle = () -> "Cognizant";
		c1.accept(orgTitle.get());
		
		Supplier<String> greeting = () -> {
			int h = LocalTime.now().getHour();
			
			String g = "";
			
			if(h>=3 && h<=11) g = "Good Morning";
			else if(h>11 && h<=15) g="Good Noon";
			else g="Good Evening";
			
			return g;
		};
		c1.accept(greeting.get());
		
		BinaryOperator<Integer> sum = (n1,n2) -> n1+n2;
		c1.accept(sum.apply(12, 15));
		
	}
}
