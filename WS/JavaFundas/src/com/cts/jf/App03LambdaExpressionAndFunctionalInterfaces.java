package com.cts.jf;

interface BinaryOperator {
	int operate(int n1, int n2);
}

interface Greet {
	String doGreet(String unm);
}

interface GetText {
	String get();
}

public class App03LambdaExpressionAndFunctionalInterfaces {

	public static void main(String[] args) {
		BinaryOperator sum = (a, b) -> a + b;
		System.out.println(sum.operate(10, 20));

		BinaryOperator maxOf = (x, y) -> x > y ? x : y;
		System.out.println(maxOf.operate(10, 20));

		Greet greet1 = userName -> "Hello " + userName;
		System.out.println(greet1.doGreet("Vamsy"));

		GetText companyName = () -> "Cognizant";
		System.out.println(companyName.get());
	}

}
