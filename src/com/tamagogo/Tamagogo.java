package com.tamagogo;

import java.util.Scanner;

public class Tamagogo {

	public static void main(String[] args) {
		
		// global element
		Scanner saisie = new Scanner(System.in);
		
		// choose your name
		System.out.println("Bienvenu sur Tamagogo\r\n"
			    +"        ,o-o-o.o.\r\n"
				+ "       o-o      o\r\n"
				+ "      _O_ `o-o-o'\r\n"
				+ "    ,'   `.\r\n"
				+ "   / _/`.-.\\\r\n"
				+ "  : \\|\"\"\"|< :\r\n"
				+ "  |-<|___|/-|\r\n"
				+ "  :  `'\\/`' :\r\n"
				+ "   `. OOO ,'\r\n"
				+ "     \"\"\"\"\"\r\n"
				+ "Un Tamgogo viens de naitre, \r\n"
				+ "Veillez lui choisir un nom");
		String name = saisie.next();
		
		// confirm name ( yes or no (y or n) oui ou non (o ou n))
		System.out.println("Votre Tamagogo s'appel bien "+ name +" ?");
		
		saisie.close();
	}

}
