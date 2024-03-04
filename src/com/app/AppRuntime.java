package com.app;

public class AppRuntime {
	public static void main(String[] args) {
		CalculMath calculMath = new CalculMath();
		System.out.println(calculMath.somme(2, 3));
		System.out.println(calculMath.difference(2, 3));
		System.out.println(calculMath.quotient(2, 3));
	  }
}
