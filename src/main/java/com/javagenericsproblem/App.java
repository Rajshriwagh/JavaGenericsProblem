package com.javagenericsproblem;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		System.out.println("Welcome to Java Generics Project");
		System.out.println("Give 3 inputs:");
		Scanner sc = new Scanner(System.in);
		IntegerMax value = new IntegerMax();
		int inp1 = Integer.parseInt(sc.nextLine());
		int inp2 = Integer.parseInt(sc.nextLine());
		int inp3 = Integer.parseInt(sc.nextLine());
		int ArrayOfInputs[] = { inp1, inp2, inp3 };
		int maxno = value.calculateMaximum(ArrayOfInputs);
		value.checkMaxAt2ndPos(ArrayOfInputs[1], maxno);
	}
}
