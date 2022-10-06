package com.cinema;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Quanti anni hai? ");
		int userAge = in.nextInt();
		int cost = 0;
		
		
		if(userAge > 15) {
			cost = 10;
		}else if(userAge >= 7 && userAge < 15) {
			cost = 6;
		}
		
		System.out.println("Il tuo  biglietto " + (cost == 0 ? "e' gratis!" : String.format("costa %.2f €", (float)cost)));	
		
		in.close();
	}
}
