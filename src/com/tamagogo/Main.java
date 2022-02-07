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
		name = saisie.next();
		
		while(!isCorrectName) {
			
			// confirm name ( yes or no ))
			System.out.println("Votre Tamagogo s'appel bien "+ name +" ?");
			
			String req = saisie.next();

			if(req.equals("oui") ||
			   req.equals("yes") || 
			   req.equals("o") || 
			   req.equals("y")) {
				isCorrectName = true;
				break;
			}
			else{
				System.out.println("Veillez choisir le nom du tamagogo");
				name = saisie.next();
			}
		}
		
		Tamagogo monster = new Tamagogo(name, 50, 50, 50);
		
		System.out.println("Veuillez choisir une action");
		System.out.println(
				"---------------------------\r\n\r\n"+
				" Statistiques\r\n\r\n"+
				" Nom : " +monster.getName()+"\r\n"+
				" * Vie : "+monster.getLife()+"/50\r\n"+
				" * Faim : "+monster.getHunger()+"/50\r\n"+
				" * Sommeil : "+monster.getSleep()+"/50\r\n\r\n" +
				"---------------------------\r\n\r\n"+
				" Choix disonible\r\n"+
				"  *\r\n"+
				"  *\r\n\r\n"+
				" Choix non disonible\r\n"+
				"  *\r\n"+
				"  *\r\n\r\n"+
				"---------------------------\r\n"
				);
		saisie.close();
	}

}
