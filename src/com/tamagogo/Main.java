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
		
		Tamagogo monster = new Tamagogo(name, 20, 10, 10);
		
		while(monster.getLife() >= 0) {
			
			System.out.println("Veuillez choisir une action");
			System.out.println(
					"---------------------------\r\n\r\n"+
					" Statistiques\r\n"+
					"  * Nom : " +monster.getName()+"\r\n"+
					"  * Vie : "+monster.getLife()+"/50\r\n"+
					"  * Faim : "+monster.getHunger()+"/50\r\n"+
					"  * Sommeil : "+monster.getSleep()+"/50\r\n\r\n" +
					"---------------------------\r\n\r\n"+
					" Actions\r\n"+
					"  * manger\r\n"+
					"  * dormir\r\n"+
					"  * sport\r\n\r\n"+
					"---------------------------\r\n"
					);

			String action = saisie.next();
			
			if(action.equals("manger")) {
				monster.toEat();
			}
			else if(action.equals("dormir")) {
				monster.toSleep();
			}
			else if(action.equals("sport")) {
				monster.playSports();
			}
			else{
				System.out.println("je n'ai pas compris");
			}
		}
		saisie.close();
		System.out.println(
				  " _.---,._,'\r\n"
				+ "/' _.--.<\r\n"
				+ "  /'     `'\r\n"
				+ "/' _.---._____\r\n"
				+ "\\.'   ___, .-'`\r\n"
				+ "    /'    \\\\             .\r\n"
				+ "  /'       `-.          -|-\r\n"
				+ " |                       |\r\n"
				+ " |                   .-'~~~`-.\r\n"
				+ " |                 .'         `.\r\n"
				+ " |                 |  R  I  P  |\r\n"
				+ " |                 |           |\r\n"
				+ " |                 |           |\r\n"
				+ "  \\              \\\\|           |//\r\n"
				+ "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("HOO NON "+monster.getName().toUpperCase()+" EST MORT T^T");
	}

}
