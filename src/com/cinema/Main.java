package com.cinema;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Quanti anni hai? ");
		int userAge = in.nextInt();
		in.nextLine();
		boolean err = false;

		if(userAge < 0){
			System.out.println("Non è possibile! Inserisci l'eta' correttamente");
		} else {
			System.out.println("Che giorno e'? \n(Lunedì, martedì ... )");
			String day = in.nextLine();
			int cost = 0;
			
			
			if(userAge > 15) {
				cost = 10;
			}else if(userAge >= 7 && userAge < 15) {
				cost = 6;
			}
			
			switch (day.toLowerCase()) {
				case "mercoledì":
					if(cost >= 2) cost -= -2;
					break;
				case "lunedì":
				case "martedì":
				case "giovedì":
				case "venerdì":
				case "sabato":
				case "domenica":
					break;
				default: 
					err = true;
					System.out.println("Il giorno non e' stato inserito correttamente");
			}
			
			System.out.println(err
					? "Hai sbagliato qualcosa nell'input"
					: "Il tuo  biglietto " + (cost == 0 ? "e' gratis!" : String.format("costa %.2f €", (float)cost)));	
			
			in.close();
		}
	}
}
