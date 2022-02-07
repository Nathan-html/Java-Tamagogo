package com.tamagogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// global element
		Scanner saisie = new Scanner(System.in);
		
		// choose your name
		System.out.println("Bienvenu sur le jeux Tamagogo, \r\n"
				+ "l'objectif est simple fait en sort que votre tamagogo ne meurt pas\r\n"
				+ "et suiver son évolution \r\n");

		System.out.println("Un oeuf de Tamgogo viens d'apparaitre\r\n\r\n"+
				  "            ████████            \r\n"
				+ "          ██        ██          \r\n"
				+ "        ██▒▒▒▒        ██        \r\n"
				+ "      ██▒▒▒▒▒▒      ▒▒▒▒██      \r\n"
				+ "      ██▒▒▒▒▒▒      ▒▒▒▒██      \r\n"
				+ "    ██  ▒▒▒▒        ▒▒▒▒▒▒██    \r\n"
				+ "    ██                ▒▒▒▒██    \r\n"
				+ "  ██▒▒      ▒▒▒▒▒▒          ██  \r\n"
				+ "  ██      ▒▒▒▒▒▒▒▒▒▒        ██  \r\n"
				+ "  ██      ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒██  \r\n"
				+ "  ██▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒██  \r\n"
				+ "    ██▒▒▒▒  ▒▒▒▒▒▒    ▒▒▒▒██    \r\n"
				+ "    ██▒▒▒▒            ▒▒▒▒██    \r\n"
				+ "      ██▒▒              ██      \r\n"
				+ "        ████        ████        \r\n"
				+ "            ████████            \r\n");
		
		String name;
		Boolean isCorrectName = false;
		
		System.out.println("Veillez choisir le nom du tamagogo");
		
		while(!isCorrectName) {
			
			name = saisie.next();
			
			// confirm name ( yes or no ))
			System.out.println("Votre Tamagogo s'appel bien "+ name +" ?");
			
			String req = saisie.next();

			if(req.equals("oui") ||
			   req.equals("yes") || 
			   req.equals("o") || 
			   req.equals("y")) {
				isCorrectName = true;
				Tamagogo monster = new Tamagogo(name, 50, 50, 50);
				break;
			}
			else{
				System.out.println("Veillez choisir le nom du tamagogo");
			}
		}
		saisie.close();
	}

}
