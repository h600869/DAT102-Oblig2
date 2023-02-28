package no.hvl.dat102.klient;

import no.hvl.dat102.kjedet.DobbelKjedetOrdnetListe;
import no.hvl.dat102.adt.DobbelKjedetOrdnetListeADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

public class Oppgave__2d {

	public static void main(String[] args) {
		String [] navn = new String [5];
		
		navn[0] = "Ayla";
		navn[1] = "Beru";
		navn[2] = "Igris";
		navn[3] = "Tank";
		navn[4] = "Roger";
		
		DobbelKjedetOrdnetListe<String> liste = new DobbelKjedetOrdnetListe(new String("AAA"), new String("zzz"));
		
		for(int i = 0; i<navn.length; i++) 
		{
			liste.leggTil(navn[i] + " ");
		}
		
		System.out.println("Hele listen med alle navnene: ");
		System.out.println(liste);
		
		
		
		System.out.println("\nAlle elementene i listen");	
		liste.visListe();
		
		System.out.println();
		System.out.println(liste.fjern("Beru "));
		
	}

}
