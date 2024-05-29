package demoFonction;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c = 40;
		
		App.calculerPerimetreTriangle(a, b, c);
		
		
	}
	public static void calculerPerimetreTriangle(int a1, int b1, int c1)
	{
		int perimetre = a1 + b1 + c1;
		
		System.out.println(perimetre);
	}
}
