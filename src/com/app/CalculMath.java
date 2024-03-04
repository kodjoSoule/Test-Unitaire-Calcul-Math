package com.app;

public class CalculMath {
//	somme de deux entiers
	public int somme(int a, int b) {
		return a + b;
	}

	public int difference(int a, int b) {
		return a - b;
	}
	public double quotient(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division par zero impossible");
		}
		return a / b;
	}
	
}
