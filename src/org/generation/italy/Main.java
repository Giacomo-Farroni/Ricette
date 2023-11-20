package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SecondMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
HashMap<String, Double> ingredienti = new HashMap <>();
ArrayList<String> ingredientiScelti = new ArrayList<>();
String scelta, risposta;

Double calorie = 0.0, quantita;

	
	ingredienti.put("aglio", 4.0 );
	ingredienti.put("cucchiaio d'olio eva", 85.0);
	ingredienti.put("peperoncino", 26.0);
	ingredienti.put("pasta", 371.0);
	ingredienti.put("alici", 40.0);
	ingredienti.put("cucchiaio di pan grattato", 35.74);
	ingredienti.put("pomodoro", 17.0);
	ingredienti.put("foglie di basilico", 0.8);
	
	System.out.println("Benvenuto/a nella nostra cucina! \nOggi il menu offre: \nA) Pasta all'arrabbiata; \nB) Pasta aglio olio e peperoncino. \nCosa ci mangiamo oggi a pranzo?");
	scelta=sc.nextLine();
	System.out.println("Questi sono gli ingredienti che abbiamo in dispensa: \n" + ingredienti + "\nI numeri a fianco degli ingredienti rappresentano le calorie!");
	
		do {
			
			System.out.println( "Dimmi quale ingrediente ti serve:");
			scelta= sc.nextLine();
			
					
					if(ingredienti.containsKey(scelta)) 
						
					{
						ingredientiScelti.add(scelta);
						
						System.out.println("Bene, ce l'abbiamo. Dimmi la quantità di cui hai bisogno:");
						
						quantita=sc.nextDouble();
						sc.nextLine();
						// alternativa --> quantita=Double.parseDouble(sc.nextLine());
					
						calorie= calorie + (ingredienti.get(scelta)*quantita);
						System.out.println("finora abbiamo " + calorie + "calorie");
						
					};
								
			
					if(!ingredienti.containsKey(scelta)) {
						System.out.println("Mi dispiace, non è rimasto questo ingrediente nella nostra dispensa");};
				
					
			System.out.println("Vuoi un altro ingrediente?");
			
			risposta=sc.nextLine();
			
		
		} while(risposta.equals("si"));
		
System.out.println("Dunque, questi sono gli ingredienti che hai scelto: " + "\n" + ingredientiScelti + "\nper questi ingredienti la somma totale delle calorie è:" + calorie);
		
		
		sc.close();
		
		
	}

}
